package com.jcLog.core.receiver;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;

import com.jcLog.bean.LogBean;

/**
 * @description: 普通本地日志记录
 * @author：孙圣然
 * @created: 2013-10-28 上午9:30:10 
 * @version：$Id: CommonLogReciver.java 31944 2013-11-08 09:01:42Z sunsr $ 
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,ltd.All Rights Reserved.
 */
public class CommonLogReciver extends ActiveMqLogReceiver{
	private static final String DESTINATION_STR = "commonLog";
	public CommonLogReciver() {
		super(DESTINATION_STR);
	}
	
	public LogBean reciveObject(){
		LogBean bean = null;
		try {
		  Message message = (Message)consumer.receive();
		  if(message==null){
			  logger.info("获得的消息为空");
			  return null;
		  }
		  ObjectMessage objMessgae = (ObjectMessage)message;
		  bean = (LogBean)objMessgae.getObject();
		  session.commit();
		  session.close();
		  connection.stop();
		  connection.close();
		} catch (JMSException e) {
			logger.error(e);
		}
		return bean;
	}
}
