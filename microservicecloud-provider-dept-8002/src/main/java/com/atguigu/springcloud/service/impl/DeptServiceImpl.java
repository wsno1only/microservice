package com.atguigu.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.atguigu.springcloud.dao.DeptDao;
import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;

@Transactional
@Service
public class DeptServiceImpl implements DeptService{
	@Autowired
	private DeptDao deptDao;
	@Override
	public boolean addDept(Dept dept) {
		// TODO Auto-generated method stub
		return deptDao.addDept(dept);
	}

	@Override
	public Dept findById(Long id) {
		// TODO Auto-generated method stub
		return deptDao.findById(id);
	}

	@Override
	public List<Dept> findAll() {
		// TODO Auto-generated method stub
		return deptDao.findAll();
	}

}
