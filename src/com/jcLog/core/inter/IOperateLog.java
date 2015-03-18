package com.jcLog.core.inter;

import com.jcLog.bean.LogBean;

/**
 * @description: 操作日志接口
 * @author：孙圣然
 * @created: 2013-10-25 上午11:06:15 
 * @version：$Id: IOperateLog.java 31302 2013-10-31 18:03:49Z sunsr $ 
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,ltd.All Rights Reserved.
 */
public interface IOperateLog {
	/**
	 * @description 记录日志
	 */
	public void log(LogBean bean);
	/**
	 * @description 返回日志查询
	 */
	public ILogQuery createLogQuery();
}
