package com.qa.myblackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidTest {
	
	 Blackjack b = new Blackjack();
	 @Test
		public void testy3() {
			assertEquals("Same entries",0, b.play(10, 10));
			}
	 
		@Test
		public void testy5() {
			assertEquals(20, b.play(10, 20));
		}
		
		@Test
		public void testy7() {
			assertEquals(21, b.play(21, 10));
		}
		
		@Test
		public void testy8() {
			assertEquals(21, b.play(21, 10));
		}

}
