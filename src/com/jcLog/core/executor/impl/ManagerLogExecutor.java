package com.jcLog.core.executor.impl;

import com.jcLog.bean.LogBean;
import com.jcLog.core.executor.LogExecutor;
import com.jcLog.core.receiver.ManagerLogReciver;
import com.jcLog.dao.ILogBeanDao;
import com.jcLog.dao.impl.LogBeanDaoImpl;


/**
 * @description: 管理日志线程执行类
 * @author：孙圣然
 * @created: 2013-10-25 下午4:06:54 
 * @version：$Id: ManagerLogExecutor.java 31560 2013-11-05 00:47:27Z sunsr $ 
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,ltd.All Rights Reserved.
 */
public class ManagerLogExecutor extends LogExecutor {

	private ILogBeanDao dao = new LogBeanDaoImpl();
	public void run(){
		log.info("开始activemq管理日志监听");
		while(true){
			ManagerLogReciver receive = new ManagerLogReciver();
			LogBean bean = receive.reciveObject();
			dao.save(bean);
		}
	}
	
	
}
