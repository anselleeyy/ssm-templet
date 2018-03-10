package com.ssm.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.ssm.bean.User;

@Repository
public interface IUserDao {

	User findUserById(@Param("id") int id);
	
}
