package stepDefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
//import org.openqa.selenium.chrome.ChromeDriver;


public class LoginSteps {
	WebDriver driver = BaseClass.driver;
	
	
	  @Given("^User has opened the SwagLabs application$")
	    public void user_has_opened_the_swaglabs_application() throws Throwable {
		  
		  driver.get("https://www.saucedemo.com/");
		  driver.manage().window().maximize();		
		  driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	    }

	    @When("^User enters correct username \"([^\"]*)\"$")
	    public void user_enters_correct_username_something(String username) throws Throwable {
	    	WebElement UserName = driver.findElement(By.id("user-name"));
	        UserName.sendKeys(username);
	    }

	    @And("^User enters correct password \"([^\"]*)\"$")
	    public void user_enters_correct_password_something(String password) throws Throwable {
	    	WebElement Password = driver.findElement(By.id("password"));
	        Password.sendKeys(password);
	    }
	    
	    @And("^User clicks on Login button$")
	    public void user_clicks_on_login_button() throws Throwable {
	    	WebElement LoginButton = driver.findElement(By.id("login-button"));
			LoginButton.click(); 
	    }
	    
	    @Then("^User should be landed on the Products Page$")
	    public void user_should_be_landed_on_the_products_page() throws Throwable {
	    	
	    	
	    	WebElement ProductPageTitle = driver.findElement(By.xpath("//*[@class='title']"));
	    	String ActText = ProductPageTitle.getText();
	    	String ExpText ="PRODUCTS";
	    	
	    	Assert.assertEquals(ExpText, ActText);
	    	
	    	Thread.sleep(3000);
	    	
	    	 }
	    
	    
	    @Then("^User should be getting \"([^\"]*)\"$")
	    public void user_should_be_getting_something(String Error) throws Throwable {
	    	
	       WebElement ErrorMsg = driver.findElement(By.xpath("//*[@data-test='error']"));
	       String ActErr = ErrorMsg.getText();
	       String ExpErr = "Epic sadface: Username and password do not match any user in this service";
	       
	       Assert.assertEquals(ActErr,ExpErr);
	    }

}