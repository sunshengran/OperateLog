package com.jcLog.bean;

import java.util.Date;

import com.jcLog.core.inter.ILogUser;

/**
 * @description:日志实体类 
 * @author：孙圣然
 * @created: 2013-10-25 上午9:29:26 
 * @version：$Id: LogBean.java 31913 2013-11-08 07:46:18Z sunsr $ 
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,ltd.All Rights Reserved.
 */
public class LogBean extends BaseBean{
	
	private static final long serialVersionUID = -4025847572616931096L;
	
	public static final Integer MANAGE_FLAG_TRUE = 1;
	public static final Integer MANAGE_FLAG_FALSE = 0;
	
	public LogBean() {
	}
	
	public LogBean(ILogUser user){
		setUserId(user.getUserId());
		setDept(user.getDept());
		setCompany(user.getCompany());
		setUserName(user.getUsername());
		if(user.isManager()==true){
			setManagerFlag(MANAGE_FLAG_TRUE);
		}else{
			setManagerFlag(MANAGE_FLAG_FALSE);
		}
	}
	
	private Integer id;
	private String userId;
	private String userName;
	private String ip;
	private String dept;
	private String company;
	private Integer managerFlag;
	private Date createDate;
	private String operType;
	private String menuName;
	private String content;
	
	private Date startDate;
	private Date endDate;
	
	public void setUser(ILogUser user){
		setUserId(user.getUserId());
		setDept(user.getDept());
		setCompany(user.getCompany());
		setUserName(user.getUsername());
		if(user.isManager()==true){
			setManagerFlag(MANAGE_FLAG_TRUE);
		}else{
			setManagerFlag(MANAGE_FLAG_FALSE);
		}
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName() {
		return userName;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getIp() {
		return ip;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Integer getManagerFlag() {
		return managerFlag;
	}
	public void setManagerFlag(Integer managerFlag) {
		this.managerFlag = managerFlag;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getOperType() {
		return operType;
	}
	public void setOperType(String operType) {
		this.operType = operType;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
}
