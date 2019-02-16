package com.bamdow;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bamdow.example.Apple;
import com.bamdow.example.Fruit;
import com.bamdow.example.People;

public class Main {

	public static void main(String[] args) {
		 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		 //error!!! except one but found two
		 //Fruit fruit = (Fruit) context.getBean(Fruit.class);
		 
		 Fruit fruit = (Fruit) context.getBean(Apple.class);
		 System.out.println(fruit);
		 People a = (People)context.getBean("people");
		 //People a = (People)context.getBean(People.class);
		
		 a.eat();
		 
		 context.close();
	}
}
