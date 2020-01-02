package com.woniu.pojo;

import java.util.List;

import lombok.Data;

@Data
public class PageBean {
	private Integer currentPage = 1;
	private Integer pages;
	private Integer pageCount = 3;
	private Integer totalCount;
	private List<Dept> data;
	private Dept selectBean;
}
