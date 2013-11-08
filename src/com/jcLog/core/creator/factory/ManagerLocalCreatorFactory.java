package com.jcLog.core.creator.factory;

import com.jcLog.core.creator.LogCreator;
import com.jcLog.core.creator.impl.ManagerLocalLogCreator;

/**
 * @description: 本地管理员日志生产者
 * @author：孙圣然
 * @created: 2013-10-25 下午2:54:48 
 * @version：$Id: ManagerLocalCreatorFactory.java 31172 2013-10-29 21:08:05Z sunsr $ 
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,ltd.All Rights Reserved.
 */
public class ManagerLocalCreatorFactory implements ILogCreatorFactory {

	@Override
	public LogCreator createLogCreator() {
		return new ManagerLocalLogCreator();
	}

}
