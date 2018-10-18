package com.qa.myblackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InvalidTest {
	
	Blackjack b = new Blackjack();
	@Test
	public void testy() {
		assertEquals("2 low invalid entries", 0, b.play(-10, -7));
	}
	
	@Test
	public void testy1() {
		assertEquals("1 low invalid entries",0, b.play(-10, 10));

		
	}
	
	@Test 
	public void testy2() {
		assertEquals("2 invalid entries",0, b.play(-10, 50));
	}
	
	@Test
	public void testy4() {
		assertEquals("2 invalid entries",0, b.play(10, 0));
	}
	
	@Test
	public void testy6() {
		assertEquals("1 max entry",0, b.play(10, 22));
	}

}
