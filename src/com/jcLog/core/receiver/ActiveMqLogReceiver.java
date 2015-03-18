package com.jcLog.core.receiver;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.MessageConsumer;
import javax.jms.Session;

import org.apache.log4j.Logger;

import com.jcLog.core.activemq.ActivemqUtil;

/**
 * @description: 日志接收基类
 * @author：孙圣然
 * @created: 2013-10-25 下午3:52:36 
 * @version：$Id: ActiveMqLogReceiver.java 31172 2013-10-29 21:08:05Z sunsr $ 
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,ltd.All Rights Reserved.
 */
public class ActiveMqLogReceiver {
	protected Logger logger = Logger.getLogger(this.getClass());
	protected MessageConsumer consumer = null;
	protected Connection connection;
	protected Session session;
	public ActiveMqLogReceiver(String receiveQueue) {
		connection = ActivemqUtil.createConnection();
		try {
			connection.start();
			session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
			Destination destination = session.createQueue(receiveQueue);
			consumer = session.createConsumer(destination);
		} catch (Exception e) {
			logger.error(e);
		}
	}
}
