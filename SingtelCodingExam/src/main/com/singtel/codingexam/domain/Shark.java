package com.singtel.codingexam.domain;

public class Shark extends Fish {

	public Shark() {
		super(Fish.SIZE_LARGE, Fish.COLOR_GREY);
	}
	
	public void eat(Fish fish){
		System.out.println(this.getClass().getSimpleName() + " eats " + fish.getClass().getSimpleName());
	}

}
