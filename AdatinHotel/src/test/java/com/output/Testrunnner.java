package com.output;			

//login fuction only

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Featuresfiles/Adatin.feature", 
			glue = "com.stepdef", 
			publish = true, 
			monochrome = true)

public class Testrunnner {

}
