package com.hxs.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private String name;
	private Integer age;
	private List<String> families;
	private Set<String> hobby;
	private Map<String,String>  t;//教育
	
	
	public Set<String> getHobby() {
		return hobby;
	}
	public void setHobby(Set<String> hobby) {
		this.hobby = hobby;
	}
	public Map<String, String> getT() {
		return t;
	}
	public void setT(Map<String, String> t) {
		this.t = t;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Student(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student() {
		super();
	}
	
	
	
	public List<String> getFamilies() {
		return families;
	}
	public void setFamilies(List<String> families) {
		this.families = families;
	}
	public void print(){
		System.out.println("name:"+name+"age:"+age);
	}
	public void print2(){
		System.out.println("name:"+name+"age:"+age+"\nfamilies"+families);
	}
	public void print3(){
		System.out.println("name:"+name+"age:"+age+"\nfamilies"+families+hobby+t);
	}

}
