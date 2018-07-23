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
import com.singtel.codingexam.action.SwimAction;
import com.singtel.codingexam.domain.Dolphin;

@RunWith(Parameterized.class)
public class DolphinTest {

	@Parameter(value = 0)
	public Class<? extends Action> actionClass;

	@Parameter(value = 1)
	public boolean expectedReturnValue;

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { 
				{ SwimAction.class, true } });
	}

	Dolphin dolphin;

	@Before
	public void initialize() {
		dolphin = new Dolphin();
	}

	@Test
	public void testExecuteAction() {
		assertEquals(expectedReturnValue,dolphin.executeAction(actionClass));
	}

}
