package com.jcLog.core.inter;

/**
 * @description: 日志用户类，用于实现
 * @author：孙圣然
 * @created: 2013-10-25 上午11:09:08 
 * @version：$Id: ILogUser.java 31302 2013-10-31 18:03:49Z sunsr $ 
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,ltd.All Rights Reserved.
 */
public interface ILogUser {
	public String getUserId();
	public String getDept();
	public String getCompany();
	public String getUsername();
	public Boolean isManager();
}
