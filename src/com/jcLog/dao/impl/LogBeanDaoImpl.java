package com.jcLog.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.jcLog.bean.LogBean;
import com.jcLog.core.inter.IPageManager;
import com.jcLog.dao.ILogBeanDao;
import com.jcLog.database.ConnectionFactory;

/**
 * @description: 日志Dao类
 * @author：孙圣然
 * @created: 2013-10-25 上午9:47:11 
 * @version：$Id: LogBeanDaoImpl.java 31232 2013-10-30 22:29:30Z sunsr $ 
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,ltd.All Rights Reserved.
 */
public class LogBeanDaoImpl extends BaseDao<LogBean> implements ILogBeanDao{
	public Integer save(LogBean logBean){
		SqlSession session = ConnectionFactory.getSqlSessionFactory().openSession();
		String insertSql = "";
		if(logBean.getManagerFlag().equals(LogBean.MANAGE_FLAG_TRUE)){
			insertSql = getNameSpace(logBean)+".insertManager";
		}else{
			insertSql = getNameSpace(logBean)+".insert";
		}
		Integer result = session.insert(insertSql,logBean);
		session.commit();
		session.close();
		return result;
	}
	
	public Integer save(List<LogBean> list){
		SqlSession session = ConnectionFactory.getSqlSessionFactory().openSession();
		Integer result = session.insert("com.jcLog.bean.LogBean.insertCommonBatch",list);
		session.commit();
		session.close();
		return result;
	}

	@Override
	public List<LogBean> queryAll(LogBean logBean) {
		SqlSession session = ConnectionFactory.getSqlSessionFactory().openSession();
		String querySql = "";
		if(logBean.getManagerFlag().equals(LogBean.MANAGE_FLAG_TRUE)){
			querySql = getNameSpace(logBean)+".queryManager";
		}else{
			querySql = getNameSpace(logBean)+".query";
		}
		List<LogBean> list = session.selectList(querySql, logBean);
		session.commit();
		session.close();
		return list;
	}

	@Override
	public Map<String, Object> queryByPage(LogBean logBean, IPageManager page) {
		String querySql = "";
		if(logBean.getManagerFlag().equals(LogBean.MANAGE_FLAG_TRUE)){
			querySql = getNameSpace(logBean)+".queryManager";
		}else{
			querySql = getNameSpace(logBean)+".query";
		}
		//查询行数
		SqlSession session = ConnectionFactory.getSqlSessionFactory().openSession();
		int rowsCount = session.selectOne(querySql+"Count",logBean);
		page.setRowsCount(rowsCount);
				
		//计算页数  page.getRows()获得每页显示条数，系统中固定值
		int pageCount = rowsCount/page.getRows() ;
		if(rowsCount%page.getRows() > 0){
			pageCount++;
		}
		//如果传过来的当前页码大于总页码  则把当前页码设置为最大页码
		if(page.getPage() > pageCount && pageCount != 0){
			page.setPage(pageCount);
		}
		
		//将页面传过来的当前页传回到前台
		page.setPage(page.getPage());
		
		List<LogBean> list = session.selectList(querySql,logBean,new RowBounds((page.getPage()-1)*page.getRows(), page.getRows()));
		
		page.setPageCount(pageCount);
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("list", list);
		map.put("page", page);
		session.commit();
		session.close();
		return map;
	}
}
