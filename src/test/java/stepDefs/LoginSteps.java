package stepDefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	WebDriver driver = BaseClass.driver;
	
	@Given("^User has opened the Simplilearn application$")
    public void user_has_opened_the_simplilearn_application() throws Throwable {

		
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
        
    }

	@When("^User click on the Login Button$")
    public void user_click_Login_button() throws Throwable {
		
		WebElement loginLink = driver.findElement(By.xpath("//*[@class='login']"));
        loginLink.click();
    }
	
    @And("^User enters correct username \"([^\"]*)\"$")
    public void user_enters_correct_username_something(String username) throws Throwable {
    	
		WebElement UserName = driver.findElement(By.name("user_login"));
		        UserName.sendKeys(username);
        
    }
    
    @And("^User enters correct password \"([^\"]*)\"$")
    public void user_enters_correct_password_something(String password) throws Throwable {
    	
		WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys(password);
    }

    
    @And("^User clicks on Login button$")
    public void user_clicks_on_login_button() throws Throwable {
    	
		WebElement LoginButton = driver.findElement(By.name("btn_login"));
		LoginButton.click();
    }
    	
    @Then("^User should be landed on the home Page$")
    public void user_should_be_landed_on_the_home_page() throws Throwable {
    	
    	        
    }
    
    @And("^User should be able to see the welcome message$")
    public void user_should_be_able_to_see_the_welcome_message() throws Throwable {
               
    }
    
    
        
    }