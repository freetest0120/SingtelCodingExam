package com.singtel.codingexam.domain;

import com.singtel.codingexam.action.SwimAction;

public class Fish extends Animal {

	public static final String SIZE_SMALL = "Small";
	public static final String SIZE_LARGE = "Large";

	public static final String COLOR_GREY = "Grey";
	public static final String COLOR_ORANGE = "Orange";

	private String size;
	private String color;
	
	public Fish(){}

	public Fish(String size, String color) {
		super();
		this.size = size;
		this.color = color;
	}

	@Override
	protected void setActions() {
		addOrReplaceAction(new SwimAction());

	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [size=" + size + ", color="
				+ color + "]";
	}

}
