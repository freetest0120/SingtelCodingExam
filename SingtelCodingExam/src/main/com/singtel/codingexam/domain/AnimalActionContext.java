package com.singtel.codingexam.domain;

import com.singtel.codingexam.action.Action;

public class AnimalActionContext {
	
	Animal animal;
	
	public AnimalActionContext(Animal animal){
		this.animal = animal;
	}
	
	public void updateActions(Action... actions){
		for(Action act : animal.getActions()){
			animal.removeAction(act.getClass());
		}
		
		for(Action act : actions){
			animal.addOrReplaceAction(act);
		}
	}
	
	public void executeAllActions(){
		animal.executeAllActions();
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	

}
