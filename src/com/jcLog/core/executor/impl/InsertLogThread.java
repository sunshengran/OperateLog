package com.jcLog.core.executor.impl;

import java.util.ArrayList;
import java.util.List;


import com.jcLog.bean.LogBean;
import com.jcLog.core.disruptor.DisruptorContext;
import com.jcLog.core.disruptor.DisruptorLogCreate;
import com.jcLog.dao.ILogBeanDao;
import com.jcLog.dao.impl.LogBeanDaoImpl;
import com.jcLog.util.GlobalContext;

/**
 * @description: 多线程插入数据库
 * @author：孙圣然
 * @created: 2013-10-29 下午4:02:46 
 * @version：$Id: InsertLogThread.java 31560 2013-11-05 00:47:27Z sunsr $ 
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,ltd.All Rights Reserved.
 */
public class InsertLogThread implements Runnable {
	private ILogBeanDao dao = new LogBeanDaoImpl();
	List<LogBean> list = new ArrayList<LogBean>();
	
	public void setList(List<LogBean> list) {
		this.list = list;
	}
	
	@Override
	public void run() {
		if(GlobalContext.USER_DSIRUPTOR==1){
			DisruptorLogCreate creator = new DisruptorLogCreate(DisruptorContext.getRingBuffer());
			creator.log(list);
		}else{
			dao.save(list);
		}
	}

}
