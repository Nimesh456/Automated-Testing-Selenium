package com.qa.myblackjack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;



public class BlackjackTest {
	
	static int x = 1;
	Blackjack b = new Blackjack();
	
	@BeforeClass
	public static void beforeTest() {
		System.out.println("Welcome");
	}
	
	@Before
	public void setup() {
		System.out.println(x+ "/17");
	}

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
	public void testy3() {
		assertEquals("Same entries",0, b.play(10, 10));
		}
	
	@Test
	public void testy4() {
		assertEquals("2 invalid entries",0, b.play(10, 0));
	}
	
	
	@Test
	public void testy5() {
		assertEquals(20, b.play(10, 20));
	}
	
	@Test
	public void testy6() {
		assertEquals("1 max entry",0, b.play(10, 22));
	}
	
	@Test
	public void testy7() {
		assertEquals(21, b.play(21, 10));
	}
	
	@Test
	public void testy8() {
		assertEquals(18, b.play(18, 16));
	}
	
	@Test
	public void testy9() {
		assertEquals("2 same entries",0, b.play(30, 30));
	}
	
	@Test
	public void testy10() {
		assertEquals("2 invalid entries",0, b.play(30, -10));
	}
	
	@Test
	public void testy11() {
		assertEquals("2 invalid entries",0, b.play(30, 10));
	}
	
	@Test
	public void testy12() {
		assertEquals("2 invalid entries",0, b.play(30, 50));
	}
	
	@Test
	public void testy13() {
		assertEquals("2 invalid entries",0, b.play(55, -10));
	}
	
	@Test
	public void testy14() {
		assertEquals("2 maximum invalid entries",0, b.play(55, 55));
	}
	
	@Test
	public void testy15() {
		assertEquals("1 maximum entries",0, b.play(35, 20));
	}
	
	@Test
	public void testy16() {
		assertEquals("2 maximum entries",0, b.play(35, 50));
	}
	
	

		@After
		public void teardown() {
			System.out.println("Test" + x+ "/17" + "finished\n");
			x++;
		}
		

		
		@AfterClass
		public static void afterclass() {
			System.out.println("Test class complete");
		}
	
	
}


