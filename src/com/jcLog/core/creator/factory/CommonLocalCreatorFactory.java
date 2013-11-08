package com.jcLog.core.creator.factory;

import com.jcLog.core.creator.LogCreator;
import com.jcLog.core.creator.impl.CommonLocalLogCreator;

/**
 * @description: 本地普通日志生产者
 * @author：孙圣然
 * @created: 2013-10-25 下午2:54:48 
 * @version：$Id: CommonLocalCreatorFactory.java 31560 2013-11-05 00:47:27Z sunsr $ 
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,ltd.All Rights Reserved.
 */
public class CommonLocalCreatorFactory implements ILogCreatorFactory {

	@Override
	public LogCreator createLogCreator() {
		return new CommonLocalLogCreator();
	}

}
