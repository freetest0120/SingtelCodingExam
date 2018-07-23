package com.singtel.codingexam.domain;

import com.singtel.codingexam.action.SoundAction;
import com.singtel.codingexam.action.SwimAction;

public class Duck extends Bird {

	@Override
	protected void setActions() {
		super.setActions();
		addOrReplaceAction(new SoundAction("Quack, quack"));
		addOrReplaceAction(new SwimAction());
	}
	
}
