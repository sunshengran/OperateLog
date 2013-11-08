package com.jcLog.core.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.jcLog.bean.LogBean;
import com.jcLog.core.inter.ILogQuery;
import com.jcLog.core.inter.IPageManager;
import com.jcLog.dao.ILogBeanDao;
import com.jcLog.dao.impl.LogBeanDaoImpl;

/**
 * @description: 查询实现类
 * @author：孙圣然
 * @created: 2013-10-30 上午9:25:56 
 * @version：$Id: LogQueryImpl.java 31232 2013-10-30 22:29:30Z sunsr $ 
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,ltd.All Rights Reserved.
 */
public class LogQueryImpl implements ILogQuery {
	
	private LogBean logBean = new LogBean();
	private ILogBeanDao dao = new LogBeanDaoImpl();
	
	public LogQueryImpl() {
		logBean.setManagerFlag(LogBean.MANAGE_FLAG_FALSE);
	}
	
	@Override
	public ILogQuery setUsesId(String userId) {
		logBean.setUserId(userId);
		return this;
	}

	@Override
	public ILogQuery setStartDate(Date startDate) {
		logBean.setStartDate(startDate);
		return this;
	}

	@Override
	public ILogQuery setEndDate(Date endDate) {
		logBean.setEndDate(endDate);
		return this;
	}

	@Override
	public ILogQuery setOperType(String operType) {
		logBean.setOperType(operType);
		return this;
	}

	@Override
	public ILogQuery isManager(Boolean managerFlag) {
		if(managerFlag == true){
			logBean.setManagerFlag(LogBean.MANAGE_FLAG_TRUE);
		}else{
			logBean.setManagerFlag(LogBean.MANAGE_FLAG_FALSE);
		}
		return this;
	}

	@Override
	public List<LogBean> list() {
		return dao.queryAll(logBean);
	}

	@Override
	public Map<String, Object> listByPage(IPageManager page) {
		return dao.queryByPage(logBean, page);
	}

}
