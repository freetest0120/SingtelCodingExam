package com.singtel.codingexam.domain;

public class ClownFish extends Fish {

	public ClownFish() {
		super(Fish.SIZE_SMALL, Fish.COLOR_ORANGE);
	}
	
	public void makeJoke(){
		System.out.println(this.getClass().getSimpleName() + " makes joke ");
	}
}
