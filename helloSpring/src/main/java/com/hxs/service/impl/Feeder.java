package com.hxs.service.impl;

public class Feeder {
	//喂动物
	//  喂动物前  ,先执行洗澡切面    除了小猪不能吃，太脏了 
	public void feed(String name){
		System.out.println("执行了，喂"+name+"任务，经验-100");
	}

}
