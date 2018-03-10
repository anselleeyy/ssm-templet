package com.ssm.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssm.service.IUserService;
import com.ssm.bean.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/applicationContext.xml" })
public class Testssm {
	
	@Resource
	private IUserService userService;

	@Test
	public void testGetUsers() {
		
		User users = userService.findUserById(1);
		System.out.println(users);
		
	}
	
}
