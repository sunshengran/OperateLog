package com.jcLog.core.inter;

public interface IPageManager extends Cloneable{
	public int getPage();
	public void setPage(int page);
	public int getRows();
	public void setRows(int rows);
	public int getRowsCount();
	public void setRowsCount(int rowsCount);
	public int getPageCount();
	public void setPageCount(int pageCount);
}	
