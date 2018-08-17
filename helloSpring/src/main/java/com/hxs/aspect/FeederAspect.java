package com.hxs.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class FeederAspect {
	
	public boolean around(ProceedingJoinPoint pjp){
		boolean ok=false;
		Object[] args=pjp.getArgs();
		System.out.println("这是前置通知---调用洗澡方法");
		try {
			//目标方法执行
			if(pjp.getArgs()[0]!="小猪"){
			pjp.proceed(args);
			ok=true;//正常执行
			}
			else{
				System.out.println("洗不干净的小猪，放弃喂食");
			}
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
	
		System.out.println("这是后置通知---啥事没干");

		return ok;
	}

}
