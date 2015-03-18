package com.jcLog.core.creator.impl;

import java.util.Date;

import com.jcLog.bean.LogBean;
import com.jcLog.core.creator.LogCreator;
import com.jcLog.core.receiver.ManagerLocalLogReciver;

/**
 * @description: 管理员本地日志生产者
 * @author：孙圣然
 * @created: 2013-10-25 下午1:57:02 
 * @version：$Id: ManagerLocalLogCreator.java 31172 2013-10-29 21:08:05Z sunsr $ 
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,ltd.All Rights Reserved.
 */
public class ManagerLocalLogCreator extends LogCreator{
	
	@Override
	public void log(LogBean logBean) {
		if(logBean.getCreateDate()==null){
			logBean.setCreateDate(new Date());
		}
		ManagerLocalLogReciver receive = new ManagerLocalLogReciver(logBean);
		receive.run();
	}
}
