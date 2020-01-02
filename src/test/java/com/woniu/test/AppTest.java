package com.woniu.test;


import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.woniu.dao.DeptMapper;


public class AppTest {

	@Test
	public void test() {
		try {
			InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
			SqlSession session = sessionFactory.openSession();
			//==================================================
			DeptMapper mapper = session.getMapper(DeptMapper.class);
			//SelectBean sb = new SelectBean();
//			sb.setCurrentPage(1);
//			sb.setPageCount(3);
//			List<Dept> list = mapper.findByPage(sb);
//			System.out.println(list);
	
			//===================================================
			session.commit();
			session.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
