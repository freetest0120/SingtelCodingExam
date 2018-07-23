package com.singtel.codingexam.domain;

import com.singtel.codingexam.action.WalkAction;

public class Caterpillar extends Animal {

	@Override
	protected void setActions() {
		addOrReplaceAction(new WalkAction());

	}

}
