package com.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.ssm.bean.User;
import com.ssm.dao.IUserDao;
import com.ssm.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Resource
	private IUserDao userDao;
	
	
	@Override
	@Cacheable(value = "userCache", key = "'id_'+#id")
	public User findUserById(int id) {
		// TODO Auto-generated method stub
		return userDao.findUserById(id);
	}
	
	

}
