package com.singtel.codingexam.domain;

import com.singtel.codingexam.action.FlyAction;
import com.singtel.codingexam.action.SoundAction;

public class Chicken extends Bird {

	@Override
	protected void setActions() {
		super.setActions();
		addOrReplaceAction(new SoundAction("Cluck, cluck"));
		removeAction(FlyAction.class);
	}
}
