package com.sa.util;

import java.util.List;

/**
 * 分页模型类
 * @author safiri
 * 当前页数据集合
 * 总记录数
 * 总页数
 * 当前页
 * 每页显示记录数
 */
public class PageBean<T> {
	
	private int currentPage;   //当前页
	private int totalPage;     //总页数
	private int pageSize;      //每页记录数
	private int totalSize;     //总记录数
	private List<T> list; //当前页数据集合
	
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalSize() {
		return totalSize;
	}
	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	
	
}
