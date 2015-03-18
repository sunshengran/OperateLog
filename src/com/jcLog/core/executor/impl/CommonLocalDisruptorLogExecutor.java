package com.jcLog.core.executor.impl;

import com.jcLog.core.disruptor.DisruptorContext;
import com.jcLog.core.executor.LogExecutor;


/**
 * @description: 普通日志线程执行类（用disruptor）
 * @author：孙圣然
 * @created: 2013-10-25 下午4:06:54 
 * @version：$Id: CommonLocalDisruptorLogExecutor.java 31560 2013-11-05 00:47:27Z sunsr $ 
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,ltd.All Rights Reserved.
 */
public class CommonLocalDisruptorLogExecutor extends LogExecutor {

	public void run(){
		log.info("开始disruptor监听器");
		DisruptorContext.startLogExecutor();
	}
	
	
}
