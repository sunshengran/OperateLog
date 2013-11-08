package com.jcLog.util;

import com.jcLog.core.executor.impl.CommonLogExecutor;
import com.jcLog.core.executor.impl.ManagerLogExecutor;

/**
 * @description: 系统入口
 * @author：孙圣然
 * @created: 2013-10-28 下午2:40:15 
 * @version：$Id: RunLog.java 31125 2013-10-28 21:28:33Z sunsr $ 
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,ltd.All Rights Reserved.
 */
public class RunLog {
	public static void main(String[] args) {
		CommonLogExecutor executor = new CommonLogExecutor();
		executor.run();
		ManagerLogExecutor managerExecutor = new ManagerLogExecutor();
		managerExecutor.run();
	}
}
