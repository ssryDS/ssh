package com.hxs.helloSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hxs.service.UserService;

import junit.framework.TestCase;

public class TestAOP extends TestCase{
	public void testAOP1(){
		ApplicationContext context= new ClassPathXmlApplicationContext("spring-aspect.xml");
		UserService userService=(UserService) context.getBean("userService");
		userService.addUser("李四");
	}
	public void testAOP2(){
		ApplicationContext context= new ClassPathXmlApplicationContext("spring-aspect.xml");
		UserService userService=(UserService) context.getBean("userService");
		userService.delUser();
	}
	public void testAOP3(){
		ApplicationContext context= new ClassPathXmlApplicationContext("spring-aspect2.xml");
		UserService userService=(UserService) context.getBean("userService");
		userService.delUser();
	}

}
