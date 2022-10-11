package com.hong.app;

public class Student {
	String name;
	int age;
	String gradeNum;
	String classNum;
	
	
	
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



	public String getGradeNum() {
		return gradeNum;
	}



	public void setGradeNum(String gradeNum) {
		this.gradeNum = gradeNum;
	}



	public String getClassNum() {
		return classNum;
	}



	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}



	public void getStudentInfo() {
		System.out.println("getStudentInfo");
	}
}
