package com.singtel.codingexam.domain;

import java.util.LinkedHashSet;

import com.singtel.codingexam.action.Action;

public class Rooster {
	
	private final LinkedHashSet<Action> actionSet = new LinkedHashSet<>(); 
	
	public Rooster (Action... actions) {
		for(Action act : actions){
			actionSet.add(act);
		}
	}

	public LinkedHashSet<Action> getActionSet() {
		return actionSet;
	}

}
