package com.hxs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import javax.annotation.*;
import com.hxs.dao.UserDao;
import com.hxs.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService{
	//@Resource(name="userDao")
	
	@Autowired
	@Qualifier("userDao")
	UserDao userDao;//不new，用spring注入

	
	
	public UserDao getUserDao() {
		return userDao;
	}



	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	//增加关系
	public void addUser(String name) {
		
		userDao.addUser();
		
	}
	
	public void delUser(){
		int n=10/0;
		System.out.println("删除方法");
	}

}
