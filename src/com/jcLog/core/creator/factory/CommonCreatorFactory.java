package com.jcLog.core.creator.factory;

import com.jcLog.core.creator.LogCreator;
import com.jcLog.core.creator.impl.CommonLogCreator;

/**
 * @description: 普通日志生产者
 * @author：孙圣然
 * @created: 2013-10-25 下午2:54:48 
 * @version：$Id: CommonCreatorFactory.java 31118 2013-10-28 20:24:44Z sunsr $ 
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,ltd.All Rights Reserved.
 */
public class CommonCreatorFactory implements ILogCreatorFactory {

	@Override
	public LogCreator createLogCreator() {
		return new CommonLogCreator();
	}

}
