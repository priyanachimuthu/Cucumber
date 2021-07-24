package stepDefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FBSignUpSteps {
	
	WebDriver driver = BaseClass.driver;
	
	  	@Given("^User has launched the FB application$")
	    public void user_has_launched_the_fb_application() throws Throwable {
	  		
	  		driver.get("https://en-gb.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	        
	    }

	    @When("^User clicks on the Create New Account Link$")
	    public void user_clicks_on_the_create_new_account_link() throws Throwable {
	    	
	    	WebElement CreateAccount = driver.findElement(By.xpath("//*[text()='Create New Account']"));
	    	CreateAccount.click();
	        
	    }
	    
	    @And("^User creates the new account$")
	    public void user_creates_the_new_account(DataTable table) throws Throwable {
	    	
	    	String FirstName = table.cell(1, 1);
	    	String LastName = table.cell(2, 1);
	    	String MobileNum = table.cell(3, 1);
	    	String Password = table.cell(4, 1);
	    	
	    	WebElement tbFirstName = driver.findElement(By.xpath("//*[@name='firstname']"));
	    	WebElement tbLastName = driver.findElement(By.xpath("//*[@name='lastname']"));
	    	WebElement tbMobile = driver.findElement(By.xpath("//*[@name='reg_email__']"));
	    	WebElement tbPassword = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
	    	
	    	tbFirstName.sendKeys(FirstName);
	    	tbLastName.sendKeys(LastName);
	    	tbMobile.sendKeys(MobileNum);
	    	tbPassword.sendKeys(Password);
	    	
	    	
	    }
	    

	    @Then("^user should be able to see the success message$")
	    public void user_should_be_able_to_see_the_success_message() throws Throwable {
	        System.out.println("Successfully Created Account");
	    }

	    @And("^User enters \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_enters_something_something_something_and_something(String firstname, String lastname, String mobilenum, String password) throws Throwable {
	       
	    }

	    @And("^User selects \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_selects_something_something_and_something(String month, String date, String year) throws Throwable {
	        
	    }

	    @And("^User click on the SignUp button$")
	    public void user_click_on_the_signup_button() throws Throwable {
	        
	    }

}
