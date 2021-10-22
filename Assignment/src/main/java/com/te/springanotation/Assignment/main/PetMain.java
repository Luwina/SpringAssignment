package com.te.springanotation.Assignment.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springanotation.Assignment.bean.Pet;
import com.te.springanotation.Assignment.config.TogetherConfig;

public class PetMain {
public static void main(String[] args) {
	
	ApplicationContext context = new AnnotationConfigApplicationContext(TogetherConfig.class);
	Pet pet = context.getBean("mypet", Pet.class);
	System.out.println(pet.getName());
	pet.getPet();;
}
}

