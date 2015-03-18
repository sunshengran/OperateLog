package com.jcLog.core.creator.impl;

import java.util.Date;

import com.jcLog.bean.LogBean;
import com.jcLog.core.activemq.ActivemqUtil;
import com.jcLog.core.creator.LogCreator;

/**
 * @description: 管理员日志生产者
 * @author：孙圣然
 * @created: 2013-10-25 下午1:57:02 
 * @version：$Id: ManagerLogCreator.java 31118 2013-10-28 20:24:44Z sunsr $ 
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,ltd.All Rights Reserved.
 */
public class ManagerLogCreator extends LogCreator{
	
	private final String DESTINATION_STR = "managerLog";
	
	@Override
	public void log(LogBean logBean) {
		if(logBean.getCreateDate()==null){
			logBean.setCreateDate(new Date());
		}
		ActivemqUtil.sendMessage(logBean, DESTINATION_STR);
	}

}
