package com.jcLog.core.receiver;

import org.apache.log4j.Logger;

import com.jcLog.bean.LogBean;
import com.jcLog.dao.ILogBeanDao;
import com.jcLog.dao.impl.LogBeanDaoImpl;

/**
 * @description: 管理者日志本地日志接受者
 * @author：孙圣然
 * @created: 2013-10-29 上午10:42:36 
 * @version：$Id: ManagerLocalLogReciver.java 31172 2013-10-29 21:08:05Z sunsr $ 
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,ltd.All Rights Reserved.
 */
public class ManagerLocalLogReciver implements Runnable{
	
	Logger log = Logger.getLogger(ManagerLocalLogReciver.class);
	
	LogBean logBean;
	
	ILogBeanDao dao = new LogBeanDaoImpl();
	
	public ManagerLocalLogReciver(LogBean logBean) {
		this.logBean = logBean;
	}
	
	@Override
	public void run() {
		try {
			dao.save(logBean);
		} catch (Exception e) {
			log.error("插入管理员日志失败",e);
		}
	}
	
}
