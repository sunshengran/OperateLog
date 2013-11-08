package com.jcLog.dao;

import java.util.List;
import java.util.Map;

import com.jcLog.bean.LogBean;
import com.jcLog.core.inter.IPageManager;

/**
 * @description: 日志Dao接口
 * @author：孙圣然
 * @created: 2013-10-25 上午10:22:49 
 * @version：$Id: ILogBeanDao.java 31203 2013-10-30 17:16:10Z sunsr $ 
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,ltd.All Rights Reserved.
 */
public interface ILogBeanDao {
	public Integer save(LogBean logBean);
	public Integer save(List<LogBean> list);
	
	public List<LogBean> queryAll(LogBean logBean);
	public Map<String,Object> queryByPage(LogBean o,IPageManager page);
}
