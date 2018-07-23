package com.singtel.codingexam.singtelcodingexam;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import com.singtel.codingexam.action.FlyAction;
import com.singtel.codingexam.action.SingAction;
import com.singtel.codingexam.action.SoundAction;
import com.singtel.codingexam.action.SwimAction;
import com.singtel.codingexam.action.WalkAction;
import com.singtel.codingexam.domain.Animal;
import com.singtel.codingexam.domain.AnimalActionContext;
import com.singtel.codingexam.domain.AnimalBuilder;
import com.singtel.codingexam.domain.Bird;
import com.singtel.codingexam.domain.Butterfly;
import com.singtel.codingexam.domain.Caterpillar;
import com.singtel.codingexam.domain.Chicken;
import com.singtel.codingexam.domain.ClownFish;
import com.singtel.codingexam.domain.Dolphin;
import com.singtel.codingexam.domain.Duck;
import com.singtel.codingexam.domain.Fish;
import com.singtel.codingexam.domain.Parrot;
import com.singtel.codingexam.domain.Rooster;
import com.singtel.codingexam.domain.Shark;
import com.singtel.codingexam.filter.AnimalActionFilter;


public class SingtelCodingExam {
	
	public static void main(String args[]){
		Bird bird = new Bird();
		bird.executeAllActions();
		System.out.println();
		
		
		Bird duck = new Duck();
		duck.executeAllActions();
		System.out.println();
		
		
		Bird chicken = new Chicken();
		chicken.executeAllActions();
		System.out.println();

		
		AnimalBuilder animalBuilder = new AnimalBuilder();		
		Animal chickenRooster = animalBuilder.buildRooster(new Rooster(new SoundAction("Cock-a-doodle-doo")));
		chickenRooster.executeAllActions();
		System.out.println();

		
		Parrot parrot1 = new Parrot(new SoundAction("Woof, woof"));							// Dog
		Parrot parrot2 = new Parrot(new SoundAction("Meow"));								// Cat
		Parrot parrot3 = new Parrot((SoundAction)chicken.getAction(SoundAction.class));		// Referencing from animal object
		parrot1.executeAction(SoundAction.class);
		parrot2.executeAction(SoundAction.class);
		parrot3.executeAction(SoundAction.class);
		System.out.println();
		
		
		ClownFish clownFish = new ClownFish();
		System.out.println(clownFish);
		clownFish.executeAllActions();
		System.out.println();
		
		
		Shark shark = new Shark();
		System.out.println(shark);
		shark.executeAllActions();
		shark.eat(clownFish);
		System.out.println();
		
		
		Dolphin dolphin = new Dolphin();
		dolphin.executeAllActions();
		System.out.println();
		
		
		Butterfly butterfly = new Butterfly();
		butterfly.executeAllActions();
		System.out.println();
		
		Caterpillar caterpillar = new Caterpillar();
		caterpillar.executeAllActions();
		System.out.println("Changing caterpillar action(s)...   (Morphing to a butterfly)");
		
		
		AnimalActionContext catepillarContext = new AnimalActionContext(caterpillar);
		catepillarContext.updateActions(new FlyAction());
		catepillarContext.executeAllActions();
		System.out.println();
		
		
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(new Bird());
		animalList.add(new Butterfly());
		animalList.add(new Caterpillar());
		animalList.add(new Chicken());
		animalList.add(new ClownFish());
		animalList.add(new Dolphin());
		animalList.add(new Duck());
		animalList.add(new Fish());
		animalList.add(new Parrot());
		animalList.add(chickenRooster);
		animalList.add(new Shark());
		
		
		AnimalActionFilter flyingFilter = new AnimalActionFilter(FlyAction.class);
		AnimalActionFilter walkingFilter = new AnimalActionFilter(WalkAction.class);
		AnimalActionFilter singingFilter = new AnimalActionFilter(SingAction.class);
		AnimalActionFilter swimmingFillter = new AnimalActionFilter(SwimAction.class);
		

		List<Animal> flyingAnimals = flyingFilter.filter(animalList);
		List<Animal> walkingAnimals = walkingFilter.filter(animalList);
		List<Animal> singingAnimals = singingFilter.filter(animalList);
		List<Animal> swimmingAnimals = swimmingFillter.filter(animalList);
		
		
		System.out.println("FlyingAnimals: " + flyingAnimals.size());
		System.out.println("WalkingAnimals: " + walkingAnimals.size());
		System.out.println("SingingAnimals: " + singingAnimals.size());
		System.out.println("SwimmingAnimals: " + swimmingAnimals.size());
		System.out.println();
		
		
		// Using single file for the resource bundle for simpler approach
		// Multiple resource bundle can also be implemented e.g message_en.properties, message_fr.properties, etc.
		ResourceBundle resourceBundle = ResourceBundle.getBundle("messages");
		Enumeration<String> keys = resourceBundle.getKeys();
		
		
		// Using keys
		while (keys.hasMoreElements()) {
			String words = resourceBundle.getString(keys.nextElement());
			AnimalBuilder animalBuilderObj = new AnimalBuilder();
			Animal roosterObj = animalBuilderObj.buildRooster(new Rooster(
					new SoundAction(words)));
			roosterObj.executeAction(SoundAction.class);
		}
		System.out.println();
		
		
		// Using Locale		
		Locale fr = Locale.FRENCH;
		System.out.println("<<FRENCH>>");
		String words = resourceBundle.getString("rooster.words." + fr.getDisplayLanguage());
		AnimalBuilder animalBuilderObj2 = new AnimalBuilder();
		Animal roosterObj2 = animalBuilderObj2.buildRooster(new Rooster(
				new SoundAction(words)));
		roosterObj2.executeAction(SoundAction.class);
		System.out.println();
		
	
	}
	
}
