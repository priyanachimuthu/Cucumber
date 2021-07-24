package stepDefs;

import cucumber.api.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import junit.framework.Assert;
import org.junit.Assert;

public class CalculatorSteps {

	int result;
	
	
	 @Given("^The calculator application is launched$")
	    public void the_calculator_application_is_launched() throws Throwable {
		 System.out.println("CAlculator App is opened");
	    }

	    @When("^I add number \"([^\"]*)\" and number \"([^\"]*)\"$")
	    public void i_add_number_something_and_number_something(int num1, int num2) throws Throwable {
	    	result = num1+num2;
	    }

	    @When("^I multiply number \"([^\"]*)\" and number \"([^\"]*)\"$")
	    public void i_multiply_number_something_and_number_something(int num1, int num2) throws Throwable {
	        
	    	result = num1*num2;
	    }

	    @Then("^I must get the result as \"([^\"]*)\"$")
	    public void i_must_get_the_result_as_something(int expResult) throws Throwable {
	        
	    	Assert.assertEquals(expResult, result);
	    }


}
