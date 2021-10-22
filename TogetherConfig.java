package com.te.springanotation.Assignment.config;

import org.springframework.context.annotation.Import;

@Import({ PetConfig.class, AnimalConfig.class })
public class TogetherConfig {
	
	
}
