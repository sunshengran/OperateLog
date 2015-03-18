package com.jcLog.bean;

import java.io.Serializable;
import java.lang.reflect.Method;

import org.apache.log4j.Logger;

/**
 * @description: bean基础类
 * @author： 孙圣然
 * @created: 2013-6-4 上午9:38:29
 * @version：  $Id: BaseBean.java 31118 2013-10-28 20:24:44Z sunsr $
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,ltd.All Rights Reserved.
 */
public class BaseBean implements Serializable{

	private static final long serialVersionUID = -1771748797466926767L;
	
	protected transient final Logger log  =  Logger.getLogger(this.getClass());
	
	/**
	 * 用于批量删除时传入主健的ids用逗号分隔
	 */
	public String[] primaryKeys;
	
	

	/**
	 * @return the primaryKeys
	 */
	public String[] getPrimaryKeys() {
		return primaryKeys;
	}

	/**
	 * @param primaryKeys the primaryKeys to set
	 */
	public void setPrimaryKeys(String[] primaryKeys) {
		this.primaryKeys = primaryKeys;
	}

	/**
	 * @获取指定属性的get方法返回值，如果为空的话返回空串
	 * ssr 2012-12-14
	 * @参数：@param name 属性名字
	 * @参数：@return
	 * @return：String
	 */
	public String getDefaultValue(String name){
		return getDefaultValue( name, "");
	}
	
	/**
	 * @获取指定属性的get方法返回值
	 * ssr 2012-12-14
	 * @参数：@param name 属性名字
	 * @参数：@param def	属性如果为空的话，返回的值
	 * @参数：@return		get返回值
	 * @return：String
	 */
	public String getDefaultValue(String name,String def){
   		try {
    		if(name != null&& name.length()>0){
   				  Method method=this.getClass().getMethod("get"+name.substring(0,1).toUpperCase()+name.substring(1));
    				Object obj=method.invoke(this);
    				if(obj== null ){
    					return def;
    				}
    				return String.valueOf(obj);
    			}
			} catch (SecurityException e) {
				log.error("获取属性错误",e);
			} catch (Exception e) {
				log.error(e);
			}
    	return name;
    }
	
	
	/**
	 * @设置指定属性的值
	 * ssr 2012-12-14
	 * @参数：@param name 属性名字
	 * @参数：@param def	设置属性的值
	 * @参数：@return
	 * @return：String
	 */
	@SuppressWarnings("rawtypes")
	public void setDefaultValue(String name, String def) {
		try {
			if (name != null && name.length() > 0) {
				Class[] argsClass = new Class[1];
				argsClass[0] = String.class;
				Method method = this.getClass().getMethod(
						"set" + name.substring(0, 1).toUpperCase()
								+ name.substring(1), argsClass);
				
				method.invoke(this, def);
			}
		} catch (SecurityException e) {
			log.error("获取属性错误",e);
		} catch (Exception e) {
			log.error(e);
		}
	}
}
