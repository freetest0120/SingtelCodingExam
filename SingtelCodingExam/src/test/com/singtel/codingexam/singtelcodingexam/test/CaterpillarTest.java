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
import com.singtel.codingexam.action.WalkAction;
import com.singtel.codingexam.domain.Caterpillar;

@RunWith(Parameterized.class)
public class CaterpillarTest {

	@Parameter(value = 0)
	public Class<? extends Action> actionClass;

	@Parameter(value = 1)
	public boolean expectedReturnValue;

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { 
				{ FlyAction.class, false },
				{ WalkAction.class, true }});
	}

	Caterpillar caterpillar;

	@Before
	public void initialize() {
		caterpillar = new Caterpillar();
	}

	@Test
	public void testExecuteAction() {
		assertEquals(expectedReturnValue,caterpillar.executeAction(actionClass));
	}

}
