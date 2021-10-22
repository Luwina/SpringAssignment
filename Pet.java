package com.te.springanotation.Assignment.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;

@Data
public class Pet {
	
		private String name;

		@Autowired
		@Qualifier("cat")
		private Animal ani;

		public void getPet() {
			ani.eat();
		
			ani.sleep();
			
		}


	}

