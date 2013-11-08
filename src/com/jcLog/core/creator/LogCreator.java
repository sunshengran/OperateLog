package com.jcLog.core.creator;

import com.jcLog.bean.LogBean;

/**
 * @description: 日志生产类
 * @author：孙圣然
 * @created: 2013-10-25 下午1:52:26 
 * @version：$Id: LogCreator.java 31118 2013-10-28 20:24:44Z sunsr $ 
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,ltd.All Rights Reserved.
 */
public abstract class LogCreator {
	public abstract void log(LogBean logBean);
}
