package com.te.springanotation.Assignment.config;

import org.springframework.context.annotation.Bean;

import com.te.springanotation.Assignment.bean.Pet;

public class PetConfig {
	@Bean(name="mypet")
	public Pet getPet() {
		Pet pet=new Pet();
		pet.setName("myworld");
		return pet;
	}

}
