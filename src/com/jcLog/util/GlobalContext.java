package com.jcLog.util;

import java.util.Map;

public class GlobalContext {
	
	private static Map<String,String> systemMap = null; 
	static{
		systemMap = PropertiesUtil.getProperties("config.properties");
	}
	
	public static final Long COMMON_LOG_TIME = Long.parseLong(systemMap.get("commonLogTime"));
	public static final Integer COMMON_LOG_NUM = Integer.parseInt(systemMap.get("cmmmonLogNum"));
	public static final Integer USER_ACTIVE = Integer.parseInt(systemMap.get("useActivemq"));
	public static final Integer USER_DSIRUPTOR = Integer.parseInt(systemMap.get("useDisruptor"));
	
}
