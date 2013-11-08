package com.jcLog.core.impl;

import org.apache.log4j.Logger;

import com.jcLog.bean.LogBean;
import com.jcLog.core.creator.LogCreator;
import com.jcLog.core.creator.factory.CommonCreatorFactory;
import com.jcLog.core.creator.factory.CommonLocalCreatorFactory;
import com.jcLog.core.creator.factory.CommonLocalDisruptorCreatorFactory;
import com.jcLog.core.creator.factory.ILogCreatorFactory;
import com.jcLog.core.creator.factory.ManagerCreatorFactory;
import com.jcLog.core.creator.factory.ManagerLocalCreatorFactory;
import com.jcLog.core.inter.ILogQuery;
import com.jcLog.core.inter.IOperateLog;
import com.jcLog.util.GlobalContext;

/**
 * @description: 操作日志实现类
 * @author：孙圣然
 * @created: 2013-10-25 下午1:51:19 
 * @version：$Id: OperateLogImpl.java 31560 2013-11-05 00:47:27Z sunsr $ 
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,ltd.All Rights Reserved.
 */
public class OperateLogImpl implements IOperateLog{
	private static Logger logger = Logger.getLogger(OperateLogImpl.class);
	@Override
	public void log(LogBean bean) {
		LogCreator creator = null;
		ILogCreatorFactory factory = null;
		if(GlobalContext.USER_ACTIVE==0){
			if(bean.getManagerFlag()==LogBean.MANAGE_FLAG_TRUE){
				factory = new ManagerLocalCreatorFactory();
			}else{
				if(GlobalContext.USER_DSIRUPTOR==1){
					factory = new CommonLocalDisruptorCreatorFactory();
				}else{
					factory = new CommonLocalCreatorFactory();
				}
			}
		}else{
			if(bean.getManagerFlag()==LogBean.MANAGE_FLAG_TRUE){
				factory = new ManagerCreatorFactory();
			}else{
				factory = new CommonCreatorFactory();
			}
		}
		try {
			creator = factory.createLogCreator();
			creator.log(bean);
		} catch (Exception e) {
			logger.error("发送日志失败",e);
		}
	}
	
	@Override
	public ILogQuery createLogQuery() {
		return new LogQueryImpl();
	}

}
