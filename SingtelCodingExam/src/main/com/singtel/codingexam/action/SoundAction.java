package com.singtel.codingexam.action;

public final class SoundAction extends Action {

	String words;

	public SoundAction(String words) {
		this.words = words;
	}

	public void setWords(String words) {
		this.words = words;
	}

	public String getWords() {
		return words;
	}

	@Override
	public void executeAction() {
		System.out.println("Saying: " + words);
	}

}
