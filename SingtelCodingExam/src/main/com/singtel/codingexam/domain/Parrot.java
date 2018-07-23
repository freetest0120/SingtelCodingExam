package com.singtel.codingexam.domain;

import com.singtel.codingexam.action.SoundAction;

public class Parrot extends Bird {

	SoundAction referenceSound;

	public Parrot(){}
	public Parrot(SoundAction referenceSound) {
		super();
		setReferenceSound(referenceSound);
	}

	@Override
	protected void setActions() {
		addOrReplaceAction(new SoundAction(""));
	}

	private void setSound() {
		if (referenceSound != null)
			addOrReplaceAction(referenceSound);
		else
			setActions();
	}

	public SoundAction getReferenceSound() {
		return referenceSound;
	}

	public void setReferenceSound(SoundAction referenceSound) {
		this.referenceSound = referenceSound;
		setSound();
	}

	public void setReferenceSound(Animal referenceAnimal) {
		this.referenceSound = (SoundAction) referenceAnimal
				.getAction(SoundAction.class);
		setSound();
	}

}
