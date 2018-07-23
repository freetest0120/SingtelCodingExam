package com.singtel.codingexam.singtelcodingexam.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.singtel.codingexam.domain.ClownFish;
import com.singtel.codingexam.domain.Fish;
import com.singtel.codingexam.domain.Shark;


public class FishFieldsTest {

	ClownFish clownFish;
	Shark shark;

	@Before
	public void initialize() {
		clownFish = new ClownFish();
		shark = new Shark();
	}

	@Test
	public void testClownFishColorValues() {
		String color = clownFish.getColor();
		assertEquals(Fish.COLOR_ORANGE, color);
	}

	@Test
	public void testClownFishSizeValues() {
		String size = clownFish.getSize();
		assertEquals(Fish.SIZE_SMALL, size);
	}
	
	@Test
	public void testSharkColorValues() {
		String color = shark.getColor();
		assertEquals(Fish.COLOR_GREY, color);
	}
	
	@Test
	public void testSharkSizeValues() {
		String size = shark.getSize();
		assertEquals(Fish.SIZE_LARGE, size);
	}

}

