package com.bamdow.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bamdow.example.Apple;
import com.bamdow.example.Fruit;
import com.bamdow.example.Orange;
import com.bamdow.example.People;

@Configuration
public class AppConfig {

	@Bean
	public Fruit apple(){
		return new Apple();
	}
	@Bean
	public Fruit orange(){
		return new Orange();
	}
	@Bean
	public People people(Fruit apple){
		People pp = new People();
		pp.setFruit(apple);
		return pp;
	}
}
