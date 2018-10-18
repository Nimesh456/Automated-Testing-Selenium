package com.qa.myblackjack;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		TestRunner.allTests();
	}
	
	public static void allTests() {
		Result result = JUnitCore.runClasses(
				InvalidTest.class,
				ValidTest.class,
				BustsTest.class);
		
		System.out.println("All results passed: "+result.wasSuccessful() );
		
		if(!result.wasSuccessful()) {
			System.out.println("Failed tests:");
		for (Failure failure: result.getFailures()) {
			System.out.println(failure.getMessage());
		}
		}
	}
}
