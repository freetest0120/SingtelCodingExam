package com.singtel.codingexam.domain;

import com.singtel.codingexam.action.SwimAction;

public class Dolphin extends Animal {

	@Override
	protected void setActions() {
		addOrReplaceAction(new SwimAction());
		
	}

}
