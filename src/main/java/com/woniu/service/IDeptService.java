package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Dept;
import com.woniu.pojo.PageBean;

public interface IDeptService {
	void save(Dept obj);
	void delete(Integer id);
	void upd(Dept obj);
	Dept findOne(Integer id);
	List<Dept> findAll();
	PageBean findByPage(PageBean pb);
}
