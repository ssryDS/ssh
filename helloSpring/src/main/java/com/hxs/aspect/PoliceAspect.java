package com.hxs.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import org.springframework.stereotype.Component;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import sun.net.www.content.image.jpeg;

/**
 * 切面类（增强性代码-非核心）
 * @author hxs
 *
 */
@Component
@Aspect
public class PoliceAspect {
	
	@Pointcut("execution(* com.hxs.service.impl.*.*(..))")
	public void add(){ }
	
	@Before("add()")
	public void check(JoinPoint jp ){
		System.out.println("你好，请停车接受检查！");
		System.out.println("类名："+jp.getTarget().getClass().getName());
		System.out.println("方法名:"+jp.getSignature().getName());
		System.out.println("注解---");
		System.out.println("增加的参数:"+jp.getArgs()[0]);
	}
	
	//之后
	public void after(){
		System.out.println("after");
		
	}
	
	//用另一个类实现，分隔
	public boolean around(ProceedingJoinPoint pjp){
		boolean ok=false;
		Object[] args=pjp.getArgs();
		System.out.println("这是前置通知");
		try {
			//目标方法执行
			//pjp.proceed(args);
			ok=true;//正常执行
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
	
		System.out.println("这是后置通知");

		return ok;
	}
	public void hasException(Exception ex){
		System.out.println("发送了异常："+ex.getMessage());
		
	}

}
