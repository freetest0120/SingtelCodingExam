package com.singtel.codingexam.domain;

import com.singtel.codingexam.action.FlyAction;
import com.singtel.codingexam.action.SingAction;
import com.singtel.codingexam.action.WalkAction;

public class Bird extends Animal {

	@Override
	protected void setActions() {
		addOrReplaceAction(new WalkAction());
		addOrReplaceAction(new FlyAction());
		addOrReplaceAction(new SingAction());
	}

	public void sing() {
		executeAction(SingAction.class);
	}

}
