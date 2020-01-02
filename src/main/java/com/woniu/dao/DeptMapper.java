package com.woniu.dao;

import java.util.List;
import java.util.Map;

import com.woniu.pojo.Dept;

public interface DeptMapper {
	void save(Dept obj);
	void delete(Integer id);
	void upd(Dept obj);
	Dept findOne(Integer id);
	List<Dept> findAll();
	List<Dept> findByPage(Map<String, Object> map);
	Integer findAllCount(Dept dept);
}
