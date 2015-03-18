package com.jcLog.core.creator.factory;

import com.jcLog.core.creator.LogCreator;

/**
 * @description: 日志生产者工具类
 * @author：孙圣然
 * @created: 2013-10-25 下午2:51:56 
 * @version：$Id: ILogCreatorFactory.java 31118 2013-10-28 20:24:44Z sunsr $ 
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,ltd.All Rights Reserved.
 */
public interface ILogCreatorFactory {
	public LogCreator createLogCreator(); 
}
