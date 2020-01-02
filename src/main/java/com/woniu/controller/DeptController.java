package com.woniu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.pojo.Dept;
import com.woniu.pojo.PageBean;
import com.woniu.service.IDeptService;

@Controller
@RequestMapping("dept")
public class DeptController {
	@Autowired
	IDeptService ds;
	
	@PostMapping
	private String save(Dept dept) {
		ds.save(dept);
		return "redirect:dept";
	}
	
	@DeleteMapping
	private String del(Integer deptno) {
		System.out.println("DeptController.del()"+deptno);
		ds.delete(deptno);
		return "redirect:dept";
	}
	
	@PutMapping
	private String upd(Dept dept) {
		ds.upd(dept);
		return "redirect:/dept";
	}
	
//	@GetMapping
//	private String findAll(HttpServletRequest req) {
//		List<Dept> deptList = ds.findAll();
//		System.out.println(deptList);
//		req.setAttribute("deptList",deptList);
//		return "dept";
//	}
	@GetMapping("{deptno}")
	private String findOne(@PathVariable Integer deptno,HttpServletRequest req) {
		Dept dept = ds.findOne(deptno);
		System.out.println(dept);
		req.setAttribute("dept",dept);
		return "upd";
	}
	
	@GetMapping
	private String findByPage(PageBean pb,HttpServletRequest req,Dept dept) {
		if(pb==null) {
			pb = new PageBean();
		}
		if(dept!=null) {
			if(dept.getDname()=="") {
				dept.setDname(null);
			}
			if(dept.getLoc()=="") {
				dept.setLoc(null);
			}
			System.out.println(dept);
			pb.setSelectBean(dept);
		}
		
//		System.out.println(dept.getDname());
//		System.out.println(dept.getLoc()+"=======================");
		pb = ds.findByPage(pb);
		req.setAttribute("pb",pb);
		return "dept";
	}
	
	
}
