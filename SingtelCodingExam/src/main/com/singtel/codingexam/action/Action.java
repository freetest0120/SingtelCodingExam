package com.singtel.codingexam.action;

public abstract class Action {
	
	private final String type = this.getClass().getSimpleName();
	
	public abstract void executeAction();

	public String getType() {
		return type;
	}

	
	

}
