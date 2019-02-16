package com.bamdow.example;

public class People {

	private String name;
	
	private Fruit fruit;
	
	public People(){
		
	}
	
	public People(String name){
		this.name = name;
	}
	
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}

	public void eat(){
		if( fruit==null ){
			System.out.println(name+" don not have a fruits");
		}else{
			System.out.println(name+"eat..."+fruit);
		}
		
	}
}
