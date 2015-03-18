package com.jcLog.core;

import com.jcLog.bean.LogBean;
import com.jcLog.core.executor.impl.CommonLocalLogExecutor;
import com.jcLog.core.executor.impl.ManagerLogExecutor;
import com.jcLog.core.impl.OperateLogImpl;
import com.jcLog.core.inter.IOperateLog;

/**
 * @description:日志操作类 
 * @author：孙圣然
 * @created: 2013-10-25 上午11:15:32 
 * @version：$Id: OperateLogUtil.java 31118 2013-10-28 20:24:44Z sunsr $ 
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,ltd.All Rights Reserved.
 */
public class OperateLogUtil {
	/**
	 * @description 插入日志
	 * @param user 操作人员
	 */
	public static void log(LogBean bean){
		IOperateLog operateLog = new OperateLogImpl();
		operateLog.log(bean);
	}
}
