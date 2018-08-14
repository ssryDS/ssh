package com.hxs.entity;

public class Users {
	String stname;
	
	
	public String getStname() {
		return stname;
	}


	public void setStname(String stname) {
		this.stname = stname;
	}


	public void sayHello(){
		System.out.println(stname+"：hello");
	} 

}
