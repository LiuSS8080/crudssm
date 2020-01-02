package com.woniu.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.DeptMapper;
import com.woniu.pojo.Dept;
import com.woniu.pojo.PageBean;
import com.woniu.service.IDeptService;
@Service
@Transactional
public class DeptServiceImpl implements IDeptService {
	@Autowired
	DeptMapper mapper;
	
	@Override
	public void save(Dept obj) {
		// TODO Auto-generated method stub
		mapper.save(obj);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		mapper.delete(id);
	}

	@Override
	public void upd(Dept obj) {
		// TODO Auto-generated method stub
		mapper.upd(obj);
	}

	@Override
	public Dept findOne(Integer id) {
		// TODO Auto-generated method stub
		return mapper.findOne(id);
	}

	@Override
	public List<Dept> findAll() {
		// TODO Auto-generated method stub
		return mapper.findAll();
	}

	@Override
	public PageBean findByPage(PageBean pb) {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<String, Object>();
		Integer start = (pb.getCurrentPage()-1)*pb.getPageCount();
		map.put("start", start);
		map.put("pageCount", pb.getPageCount());
		if(pb.getSelectBean().getDname()!=null) {
			map.put("dname", pb.getSelectBean().getDname());
		}
		if(pb.getSelectBean().getLoc()!=null) {
			map.put("loc", pb.getSelectBean().getLoc());
		}
		List<Dept> list = mapper.findByPage(map);
		pb.setData(list);
		Integer totalCount = mapper.findAllCount();
		Integer pages = totalCount%pb.getPageCount()==0?totalCount/pb.getPageCount():totalCount/pb.getPageCount()+1;
		pb.setPages(pages);
		System.out.println(pb.getData());
		return pb;
	}

}
