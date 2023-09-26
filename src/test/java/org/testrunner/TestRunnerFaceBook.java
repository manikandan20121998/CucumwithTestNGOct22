package org.testrunner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/resources",
glue="org.stepdefinition",
dryRun=false,
monochrome=true)
public class TestRunnerFaceBook extends AbstractTestNGCucumberTests {  

	
}
