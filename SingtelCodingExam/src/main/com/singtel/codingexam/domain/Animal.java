package com.singtel.codingexam.domain;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import com.singtel.codingexam.action.Action;

public abstract class Animal {

	private Map<Class<? extends Action>, Action> actions = new LinkedHashMap<>();

	public Animal() {
		setActions();
	}

	protected abstract void setActions();

	protected void addOrReplaceAction(Action action) {
		if (!actions.containsKey(action.getClass()))
			actions.remove(action.getClass());

		actions.put(action.getClass(), action);
	}

	protected void removeAction(Class<? extends Action> actionClass) {
		actions.remove(actionClass);
	}

	/**
	 * @return 
	 * A reference copy of actions associated with the Animal object
	 */
	public final Set<Action> getActions() {
		// 
		LinkedHashSet<Action> set = new LinkedHashSet<Action>(actions.values()); 
		return set;
	}

	public final Action getAction(Class<? extends Action> actionClass) {
		Action action = actions.get(actionClass);
		return action;
	}

	/**
	 * @return 
	 * true - when the action has been executed<br>
	 * false - when the actionClass argument is not the list of actions
	 */
	public final boolean executeAction(Class<? extends Action> actionClass) {
		Action action = actions.get(actionClass);

		if (action == null) {
			System.out.println(getType() + " CANNOT do " + actionClass.getSimpleName());	// printing purpose only
			return false;
		} else {
			System.out.print(getType() + " doing " + actionClass.getSimpleName() + ": ");	// printing purpose only
			action.executeAction();
			return true;
		}

	}
	
	/**
	 * This method executes all actions associated with the Animal object
	 */
	public final void executeAllActions(){
		for (Class<? extends Action> c : actions.keySet()) {
			this.executeAction(c);
		}
	}

	// Unnecessary method, printing purpose only
	public String getType() {
		return this.getClass().getSimpleName();
	}
}
