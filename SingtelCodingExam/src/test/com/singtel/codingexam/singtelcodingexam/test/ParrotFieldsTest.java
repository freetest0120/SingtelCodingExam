package com.singtel.codingexam.singtelcodingexam.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.singtel.codingexam.action.SoundAction;
import com.singtel.codingexam.domain.Duck;
import com.singtel.codingexam.domain.Parrot;

@RunWith(Parameterized.class)
public class ParrotFieldsTest {

	@Parameter(value = 0)
	public Parrot parrot;

	@Parameter(value = 1)
	public String expectedReturnValue;

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { 
				{ new Parrot(new SoundAction("Woof, woof")), "Woof, woof" },
				{ new Parrot(new SoundAction("Meow")), "Meow" },
				{ new Parrot(new SoundAction("Cock-a-doodle-doo")), "Cock-a-doodle-doo" }, 
				{ new Parrot((SoundAction)new Duck().getAction(SoundAction.class)), "Quack, quack" } });
	}
		
	@Before
	public void initialize() { }

	@Test
	public void testSountActionWordsValues() {
		assertEquals(expectedReturnValue,parrot.getReferenceSound().getWords());
	}

}
