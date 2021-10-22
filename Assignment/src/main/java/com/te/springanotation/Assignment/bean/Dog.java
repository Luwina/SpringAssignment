package com.te.springanotation.Assignment.bean;

public class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("Dog is eating now ");
		
	}

	@Override
	public void sleep() {
		System.out.println("dog is sleeping");
		
	}

}
