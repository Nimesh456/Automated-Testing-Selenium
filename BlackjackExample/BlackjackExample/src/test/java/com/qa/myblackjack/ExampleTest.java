package com.qa.myblackjack;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ExampleTest {
	
	Blackjack c = new Blackjack();
	
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {{0,0,0},{0,1,1}, {2,2,1}, {3,3,2}, {4,4,3}, {5,5,5}, {8,6,8}});
	}
	
	private int input1;
	private int input2;
	private int expected = 0;
	
	public ExampleTest(int expected,int input1, int input2) {
		input1 = input1;
		input2 = input2;
		expected = expected;
	}
	
	@Test
  public void test() {
		assertEquals(expected, c.play(input1, input2));
	}
}
