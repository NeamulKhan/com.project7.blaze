package testRunner_project7;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import utility.BaseClass_Project7;



@CucumberOptions(features = {"src/test/resources/FeatureFolder_Project7"},
plugin = {"json:target/cucumber.json"},

glue ="stepDefination_Project7", tags= {"@Signup7"}//@Login,@Signup,@Cart,@Order_Conf

)


public class TestRunner_project7 extends AbstractTestNGCucumberTests {
	

	@BeforeTest
	
	public void project7Setup() throws Exception {
		
		BaseClass_Project7 test = new BaseClass_Project7();
		
		
		test.project7browserinit();
		
	}
	
	@AfterTest
	
	public void blazeClosureURL() {
	
		BaseClass_Project7 test = new BaseClass_Project7();
		
		//test.driver.quit();
	}

}
