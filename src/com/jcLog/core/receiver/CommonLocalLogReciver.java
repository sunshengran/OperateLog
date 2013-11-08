package com.jcLog.core.receiver;

import com.jcLog.bean.LogBean;
import com.jcLog.core.queue.CommonLogQueue;

/**
 * @description: 普通日志记录
 * @author：孙圣然
 * @created: 2013-10-28 上午9:30:10 
 * @version：$Id: CommonLocalLogReciver.java 31180 2013-10-29 22:59:48Z sunsr $ 
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,ltd.All Rights Reserved.
 */
public class CommonLocalLogReciver{
	public LogBean reciveObject(){
		LogBean bean = CommonLogQueue.poll();
		return bean;
	}
}
