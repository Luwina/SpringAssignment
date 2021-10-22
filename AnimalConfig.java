package com.te.springanotation.Assignment.config;

import org.springframework.context.annotation.Bean;

import com.te.springanotation.Assignment.bean.Animal;
import com.te.springanotation.Assignment.bean.Cat;
import com.te.springanotation.Assignment.bean.Dog;

public class AnimalConfig {
@Bean(name="dog")
public Animal getDog() {
	return new  Dog();
}

@Bean(name="cat")
public Animal getCat() {
		return new Cat();
		
}
}
