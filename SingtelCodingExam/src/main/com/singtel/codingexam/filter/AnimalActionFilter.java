package com.singtel.codingexam.filter;

import java.util.ArrayList;
import java.util.List;

import com.singtel.codingexam.action.Action;
import com.singtel.codingexam.domain.Animal;

public class AnimalActionFilter implements Filter<Animal> {

	Class<? extends Action> actionClass;

	public AnimalActionFilter(Class<? extends Action> actionClass) {
		this.actionClass = actionClass;
	}

	@Override
	public List<Animal> filter(List<Animal> animals) {
		List<Animal> filteredAnimals = new ArrayList<>();

		for (Animal animal : animals) {
			if (animal.getAction(actionClass) != null) {
				filteredAnimals.add(animal);
			}
		}
		return filteredAnimals;
	}

}
