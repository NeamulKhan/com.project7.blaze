package stepDefination_Project7;

import cucumber.api.java.en.Given;
import utility.BaseClass_Project7;

public class Signup_Project7 extends BaseClass_Project7 {
	
	@Given("^Launch \"([^\"]*)\"$")
	public void launch(String URL) throws Throwable {
	    
		launchURL(URL);
		
		
	}

	

}
