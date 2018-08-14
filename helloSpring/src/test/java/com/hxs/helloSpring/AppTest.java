package com.hxs.helloSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hxs.entity.Computer;
import com.hxs.entity.Printer;
import com.hxs.entity.Users;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		assertTrue(true);
	}
	
	
	
	public void test1(){
		//得到spring容器
		ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		//容器中得到对象
		Users users= (Users) context.getBean("temo");
		users.sayHello();
		
	}
	
	public void test2(){
		ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		Printer hp=(Printer) context.getBean("hp");
		hp.printp();
		
	}
	
	
	public void test3(){
		ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		Computer computer=(Computer) context.getBean("shinelon");
		computer.print();
		
	}
	
	
	
	
	
}
