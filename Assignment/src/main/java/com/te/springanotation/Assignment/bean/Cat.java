package com.te.springanotation.Assignment.bean;

public class Cat implements Animal{

	@Override
	public void eat() {
		System.out.println("cat eat method is called");
		
	}

	@Override
	public void sleep() {
		System.out.println("cat is sleeping now ");
		
	}

}
