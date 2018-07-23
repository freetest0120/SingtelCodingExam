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

import com.singtel.codingexam.action.Action;
import com.singtel.codingexam.action.FlyAction;
import com.singtel.codingexam.action.SingAction;
import com.singtel.codingexam.action.SoundAction;
import com.singtel.codingexam.action.WalkAction;
import com.singtel.codingexam.domain.Chicken;

@RunWith(Parameterized.class)
public class ChickenTest {

	@Parameter(value = 0)
	public Class<? extends Action> actionClass;

	@Parameter(value = 1)
	public boolean expectedReturnValue;

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { 
				{ WalkAction.class, true },
				{ SingAction.class, true },
				{ SoundAction.class, true },
				{ FlyAction.class, false }});
	}

	Chicken chicken;

	@Before
	public void initialize() {
		chicken = new Chicken();
	}

	@Test
	public void testExecuteAction() {
		assertEquals(expectedReturnValue,chicken.executeAction(actionClass));
	}

}