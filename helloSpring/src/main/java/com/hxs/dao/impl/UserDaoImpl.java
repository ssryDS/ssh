package com.hxs.dao.impl;

import org.springframework.stereotype.Repository;

import com.hxs.dao.UserDao;
@Repository("userDao")
public class UserDaoImpl implements UserDao{

	public void addUser() {
		System.out.println("addUser-----dao++");
		
	}

}
