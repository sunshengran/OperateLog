package com.jcLog.test;

import com.jcLog.bean.BaseBean;
import com.jcLog.core.inter.IPageManager;


/**
 * @description: 分页信息
 * @author： 孙圣然
 * @created: 2013-6-4 上午10:42:09
 * @version：  $Id: PageManager.java 31203 2013-10-30 17:16:10Z sunsr $
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,ltd.All Rights Reserved.
 */
public class PageManager extends BaseBean implements IPageManager{
	private static final long serialVersionUID = -7333606777664101156L;
	private int page=1; // 当前页
	private int rows=10;// 每页显示记录数
	private int rowsCount = 0;
	private int pageCount = 0;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getRowsCount() {
		return rowsCount;
	}
	public void setRowsCount(int rowsCount) {
		this.rowsCount = rowsCount;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	} 
	
	
}
