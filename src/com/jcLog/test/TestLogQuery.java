package com.jcLog.test;

import java.util.Date;
import java.util.Map;

import com.jcLog.core.impl.OperateLogImpl;
import com.jcLog.core.inter.IOperateLog;
import com.jcLog.core.inter.IPageManager;

public class TestLogQuery {
	public static void main(String[] args) {
		IOperateLog log = new OperateLogImpl();
		log.createLogQuery().isManager(false).setStartDate(new Date()).list();
		
		IPageManager pageManager = new PageManager();
		Map<String,Object> map = log.createLogQuery().setEndDate(new Date()).listByPage(pageManager);
		map.get("list");
		map.get("page");
	}
}
