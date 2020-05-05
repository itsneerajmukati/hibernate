package com.nm.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nm.hibernate.dao.ParentDao;
import com.nm.hibernate.model.Parent;

@Service
@Transactional
public class ParentServiceImpl implements ParentService {

	@Autowired
	private ParentDao testDao;
	
	@Override
	public List<Parent> test() {
		return testDao.test();
	}

}
