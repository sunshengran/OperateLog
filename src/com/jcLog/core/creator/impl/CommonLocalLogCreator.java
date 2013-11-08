package com.jcLog.core.creator.impl;

import java.util.Date;

import com.jcLog.bean.LogBean;
import com.jcLog.core.creator.LogCreator;
import com.jcLog.core.queue.CommonLogQueue;

/**
 * @description: 普通日志生产者
 * @author：孙圣然
 * @created: 2013-10-25 下午1:57:02 
 * @version：$Id: CommonLocalLogCreator.java 31180 2013-10-29 22:59:48Z sunsr $ 
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,ltd.All Rights Reserved.
 */
public class CommonLocalLogCreator extends LogCreator{
	
	@Override
	public void log(LogBean logBean) {
		if(logBean.getCreateDate()==null){
			logBean.setCreateDate(new Date());
		}
		CommonLogQueue.add(logBean);
	}
}
