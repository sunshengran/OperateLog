package com.jcLog.core.executor;

import org.apache.log4j.Logger;


/**
 * @description: 日志执行接口
 * @author：孙圣然
 * @created: 2013-10-25 下午4:07:13 
 * @version：$Id: LogExecutor.java 31560 2013-11-05 00:47:27Z sunsr $ 
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,ltd.All Rights Reserved.
 */
public abstract class LogExecutor implements Runnable{
	protected Logger log = Logger.getLogger(this.getClass());
	
	public abstract void run();
}
