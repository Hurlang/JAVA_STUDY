package com.hong.app;

public class Worker {
	
	String name;
	int	age;
	String job;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getJob() {
		return job;
	}



	public void setJob(String job) {
		this.job = job;
	}



	public void getWorkerInfo() {
		System.out.println("getWorkerInfo");
	}
}
