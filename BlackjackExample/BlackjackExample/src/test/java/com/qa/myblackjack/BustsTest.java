package com.qa.myblackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BustsTest {
	
	Blackjack b = new Blackjack();
	@Test
	public void testy14() {
		assertEquals("2 maximum invalid entries",0, b.play(55, 55));
	}
	
	@Test
	public void testy15() {
		assertEquals("1 maximum entries",0, b.play(35, 20));
	}
	
	@Test
	public void testy13() {
		assertEquals("2 invalid entries",0, b.play(55, -10));
	}

}
