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
//import org.openqa.selenium.chrome.ChromeDriver;
//import io.cucumber.core.cli.Main;

public class ProductSteps {
	
	WebDriver driver = BaseClass.driver;
	
    @Given("^User_pf has opened the SwagLabs applications$")
    public void userpf_has_opened_the_swaglabs_applications() throws Throwable {
		
         driver.get("https://www.saucedemo.com/");
		  driver.manage().window().maximize();		
		  driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
    }
	
	
    @When("^User_pf enters correct username \"([^\"]*)\"$")
    public void userpf_enters_correct_username_something(String username) throws Throwable {
    	WebElement UserName = driver.findElement(By.xpath("//*[@id='user-name']"));
        UserName.sendKeys(username);
    }

    @And("^User_pf enters correct password \"([^\"]*)\"$")
    public void userpf_enters_correct_password_something(String password) throws Throwable {
    	WebElement Password = driver.findElement(By.xpath("//*[@name='password']"));
        Password.sendKeys(password);
    }
    
    @And("^User_pf clicks on Login button$")
    public void userpf_clicks_on_login_button() throws Throwable {
    	WebElement LoginButton = driver.findElement(By.id("login-button"));
		LoginButton.click(); 
    }
	
	
    @Given("^User_pf should be landed on the Products Page$")
    public void userpf_should_be_landed_on_the_products_page() throws Throwable {
    	
    	WebElement ProductPageTitle = driver.findElement(By.xpath("//*[@class='title']"));
		ProductPageTitle.isDisplayed();
		System.out.println("Inside Product Page");
    }
	

    @And("^User_pf selects a single product and User Click Add to Cart button \"([^\"]*)\"$")
    public void userpf_selects_a_single_product_and_user_click_add_to_cart_button_something(String product) throws Throwable {
    	
        WebElement SelectProd= driver.findElement(By.xpath("//*[text() = '" + product + "']//following::button[1]"));
    	SelectProd.click();     
    	System.out.println("Selected the Product");
    	Thread.sleep(3000);
    }
	
    @Then("^User_pf should be able to view the product in Mycart$")
    public void userpf_should_be_able_to_view_the_product_in_mycart() throws Throwable {
        WebElement ShopCart = driver.findElement(By.xpath("//*[@class='shopping_cart_link']"));
    	ShopCart.click();
    	System.out.println("Can View in the cart");
    	Thread.sleep(3000);
    }

   
    @And("^User_pf selects multiple products and User Click Add to Cart button$")
    public void userpf_selects_multiple_products_and_user_click_add_to_cart_button(DataTable table) throws Throwable {
    	
        String Product1 = table.cell(0,0);
        String Product2 = table.cell(1,0);
        String Product3 = table.cell(2,0);
        String Product4 = table.cell(3,0);

        WebElement Prod1 = driver.findElement(By.xpath("//*[text() = '" + Product1 + "']//following::button[1]"));
    	Prod1.click(); 
        
    	WebElement Prod2 = driver.findElement(By.xpath("//*[text() = '" + Product2 + "']//following::button[1]"));
    	Prod2.click(); 
    	
    	WebElement Prod3 = driver.findElement(By.xpath("//*[text() = '" + Product3 + "']//following::button[1]"));
    	Prod3.click(); 
    	
    	WebElement Prod4 = driver.findElement(By.xpath("//*[text() = '" + Product4 + "']//following::button[1]"));
    	Prod4.click(); 
        
    	System.out.println("Four Products are Selected");
    }

    
    @Then("^User_pf should be able to visualize the product in Mycart$")
    public void userpf_should_be_able_to_visualize_the_product_in_mycart() throws Throwable {
        WebElement ShopCart = driver.findElement(By.xpath("//*[@class='shopping_cart_link']"));
    	ShopCart.click();
    	System.out.println("Can Visualize in the cart");
    	Thread.sleep(5000);
    }

}
