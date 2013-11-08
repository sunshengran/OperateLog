package com.jcLog.core.creator.impl;

import java.util.Date;

import com.jcLog.bean.LogBean;
import com.jcLog.core.creator.LogCreator;
import com.jcLog.core.queue.CommonLogQueue;

/**
 * @description: 普通日志(disruptor)生产者
 * @author：孙圣然
 * @created: 2013-10-25 下午1:57:02 
 * @version：$Id: CommonLocalDisruptorLogCreator.java 31560 2013-11-05 00:47:27Z sunsr $ 
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,ltd.All Rights Reserved.
 */
public class CommonLocalDisruptorLogCreator extends LogCreator{
	
	@Override
	public void log(LogBean logBean) {
		if(logBean.getCreateDate()==null){
			logBean.setCreateDate(new Date());
		}
		CommonLogQueue.add(logBean);
	}
}
