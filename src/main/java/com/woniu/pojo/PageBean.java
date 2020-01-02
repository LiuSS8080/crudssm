package com.woniu.pojo;

import java.util.List;

import lombok.Data;

public class PageBean {
	private Integer currentPage = 1;
	private Integer pages;
	private Integer pageCount = 3;
	private Integer totalCount;
	private List<Dept> data;
	private Dept selectBean;
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public Integer getPages() {
		return pages;
	}
	public void setPages(Integer pages) {
		this.pages = pages;
	}
	public Integer getPageCount() {
		return pageCount;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public List<Dept> getData() {
		return data;
	}
	public void setData(List<Dept> data) {
		this.data = data;
	}
	public Dept getSelectBean() {
		return selectBean;
	}
	public void setSelectBean(Dept selectBean) {
		this.selectBean = selectBean;
	}
	@Override
	public String toString() {
		return "PageBean [currentPage=" + currentPage + ", pages=" + pages + ", pageCount=" + pageCount
				+ ", totalCount=" + totalCount + ", data=" + data + ", selectBean=" + selectBean + "]";
	}
	
}
