package com.jcLog.core.disruptor;

import com.jcLog.dao.ILogBeanDao;
import com.jcLog.dao.impl.LogBeanDaoImpl;
import com.lmax.disruptor.EventHandler;

/**
 * @description: disruptor事件处理类
 * @author：孙圣然
 * @created: 2013-11-4 下午1:56:51 
 * @version：$Id: LogEventHandler.java 31560 2013-11-05 00:47:27Z sunsr $ 
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,ltd.All Rights Reserved.
 */
public class LogEventHandler implements EventHandler<LogEvent>{

	@Override
	public void onEvent(LogEvent event, long sequence, boolean endOfBatch)
			throws Exception {
			ILogBeanDao dao = new LogBeanDaoImpl();
			dao.save(event.getLogList());
	}
	
}
