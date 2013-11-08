package com.jcLog.dao.impl;

/**
 * @description:dao基础类 
 * @author： 孙圣然
 * @created: 2013-6-4 上午10:51:33
 * @version：  $Id: BaseDao.java 31118 2013-10-28 20:24:44Z sunsr $
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,ltd.All Rights Reserved.
 */
public class BaseDao<T> {
	
	protected String getNameSpace(T o){
		return getClassName(o);
	}
	
	@SuppressWarnings("unchecked")
	private String getClassName(T o){
		Object obj = (Object)o;
		Class<T> cls = (Class<T>) obj.getClass();
		return cls.getName();
	}
	
	@SuppressWarnings({ "unchecked", "unused" })
	private String getClassPath(T o){
		Object obj = (Object)o;
		Class<T> cls = (Class<T>) obj.getClass();
		return cls.getPackage().getName();
	}
}
