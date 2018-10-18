package com.qa.CucumberParamaterisation;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Admin\\Documents\\Java\\CucumberParamaterisation\\src\\test\\java\\Parametisation.feature", glue = {"com.qa.CucumberParamaterisation"} )
public class Runner {
	
}
