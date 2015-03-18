package com.jcLog.core.disruptor;

import java.util.List;

import com.jcLog.bean.LogBean;
import com.lmax.disruptor.EventFactory;

/**
 * @description: disruptor中事件类
 * @author：孙圣然
 * @created: 2013-11-4 下午1:49:54 
 * @version：$Id: LogEvent.java 31560 2013-11-05 00:47:27Z sunsr $ 
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,ltd.All Rights Reserved.
 */
public final class LogEvent {
	private LogBean log;
	private List<LogBean> logList;
	
	public LogBean getLog() {
		return log;
	}
	
	public void setLog(LogBean log) {
		this.log = log;
	}
	
	public void setLogList(List<LogBean> logList) {
		this.logList = logList;
	}
	
	public List<LogBean> getLogList() {
		return logList;
	}
	
	public final static EventFactory<LogEvent> EVENT_FACTORY = new EventFactory<LogEvent>() {
		@Override
		public LogEvent newInstance() {
			return new LogEvent();
		}
	};
}
