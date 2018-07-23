package com.singtel.codingexam.domain;

import com.singtel.codingexam.action.Action;

public class AnimalBuilder {

	public Animal buildRooster(Rooster rooster) {
		Chicken roosterChicken = new Chicken(){
			@Override
			public String getType() {
				return "Rooster";		// print purpose only
			}
		};
		
		for (Action act : rooster.getActionSet()) {
			roosterChicken.addOrReplaceAction(act);
		}

		return roosterChicken;

	}

}
