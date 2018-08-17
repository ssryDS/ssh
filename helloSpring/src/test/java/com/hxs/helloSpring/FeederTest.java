package com.hxs.helloSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hxs.service.UserService;
import com.hxs.service.impl.Feeder;

import junit.framework.TestCase;

public class FeederTest extends TestCase{
	public void testAOPFeeder(){
		ApplicationContext context= new ClassPathXmlApplicationContext("spring-aspect.xml");
		Feeder feeder=(Feeder) context.getBean("feeder");
		feeder.feed("老虎");
		
	}

}
