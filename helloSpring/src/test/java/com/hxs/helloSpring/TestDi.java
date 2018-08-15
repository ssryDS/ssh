package com.hxs.helloSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hxs.entity.Student;
import com.hxs.service.UserService;

import junit.framework.TestCase;

public class TestDi extends TestCase{
	public void testConstrator(){
		ApplicationContext context= new ClassPathXmlApplicationContext("spring-di.xml");
		Student student=(Student) context.getBean("hero");
		Student student2=(Student) context.getBean("hero");
		System.out.println(student==student2);//测试单例
		//student.print3();
	}
	public void testUser(){
		ApplicationContext context= new ClassPathXmlApplicationContext("spring-di.xml");
		UserService us=(UserService) context.getBean("userService");
		us.addUser();
	}
	public void testauto(){
		ApplicationContext context= new ClassPathXmlApplicationContext("spring-auto.xml");
		UserService us=(UserService) context.getBean("userService");
		us.addUser();
	}
}
