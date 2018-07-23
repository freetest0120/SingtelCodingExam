package com.singtel.codingexam.domain;

import com.singtel.codingexam.action.FlyAction;

public class Butterfly extends Animal {

	@Override
	protected void setActions() {
		addOrReplaceAction(new FlyAction());
	}

}
