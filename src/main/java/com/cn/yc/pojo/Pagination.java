package com.cn.yc.pojo;

import java.io.Serializable;

/**
 * 分页 pojo
 * @author yuanchen
 *
 */
public class Pagination implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9003738096365405291L;
	
	private long totalRow = -1;
	private long startRow;
	private long pageSize = 15;
	private long currPage = 1;
	private long totalPage = 1;
	
	
	public long getTotalRow() {
		return totalRow;
	}
	public void setTotalRow(long totalRow) {
		this.totalRow = totalRow;
	}
	public long getStartRow() {
		return (currPage-1)*pageSize;
	}
	public void setStartRow(long startRow) {
		this.startRow = startRow;
	}
	public long getPageSize() {
		return pageSize;
	}
	public void setPageSize(long pageSize) {
		this.pageSize = pageSize;
	}
	public long getCurrPage() {
		return currPage;
	}
	public void setCurrPage(long currPage) {
		this.currPage = currPage;
	}
	public long getTotalPage() {
		totalPage = totalRow/pageSize;
		if(totalRow%pageSize>0)
			totalPage++;
		return totalPage;
	}
	public void setTotalPage(long totalPage) {
		this.totalPage = totalPage;
	}
	
}
