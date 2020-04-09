package com.max_international.testrunner;

/**
 *
 * @author nimit.jain
 */

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin   = { "pretty", 
							  "json:target/cucumber-report.json",
					 		  "html:target/cucumber-report.html" }, 
				
				features = "src/test/resources/features/frontend/product.feature",

				 glue = {"com.max_international.stepdefs"},
				 
						 tags= {"@p1,@c10"},
						 monochrome= true
)
				
public class RunCukeTestFrontend {

}

