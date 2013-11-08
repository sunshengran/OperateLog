package com.jcLog.test;

import com.jcLog.bean.LogBean;
import com.jcLog.core.impl.OperateLogImpl;
import com.jcLog.core.inter.IOperateLog;

public class TestLog {
	public static void main(String[] args) {
		IOperateLog log = new OperateLogImpl();
		for(int i=0;i<120;i++){
			LogBean bean = new LogBean();
			bean.setUserId("userId");
			bean.setCompany("company");
			bean.setContent("content");
			bean.setDept("dept");
			bean.setIp("IP");
			bean.setManagerFlag(LogBean.MANAGE_FLAG_FALSE);
			bean.setMenuName("menuName");
			bean.setOperType("operType");
			bean.setUserName("username");
			log.log(bean);
		}
	}
}
