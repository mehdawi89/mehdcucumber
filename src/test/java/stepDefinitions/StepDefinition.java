package stepDefinitions;

import org.junit.runner.RunWith;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Locaters.checkoutLocaters;
import PageFactory.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import junit.framework.Assert;

@RunWith(Cucumber.class)
public class StepDefinition {
	
	public WebDriver driver;
	
	@Given("^User is on netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
		
		System.out.println("First step ");
    }

    @When("^User Login into application with user and password$")
    public void user_login_into_application_with_user_and_password() throws Throwable {
		System.out.println("Second step ");

    }
    
    @And("^The Session is terminated$")
    public void the_session_is_terminated() throws Throwable {
    	
    	driver.close();
    }

    @Then("^homepage is populated$")
    public void homepage_is_populated() throws Throwable {
		System.out.println("Third step ");

    }

    @And("^all the cards should be dispplayed$")
    public void all_the_cards_should_be_dispplayed() throws Throwable {
    	
		System.out.println("4TH step ");

    }
    
    @Given("^user is on Greencart landing page$")
    public void user_is_on_greencart_landing_page() throws Throwable {
    	
        driver=Base.GetDriver();
    	
    	Thread.sleep(3000);
    }

    @When("^User search for \"([^\"]*)\" Vegetable$")
    public void user_search_for_something_vegetable(String strArg1) throws Throwable {
    	
    	System.out.println(strArg1);
    	 driver.findElement(By.xpath("//input[@type='search']")).sendKeys(strArg1);
    }

    @Then("^\"([^\"]*)\" Results are displayed$")
    public void something_results_are_displayed(String strArg1) throws Throwable {
    	
    	String text =driver.findElement(By.xpath("//*[contains(text(),'Cucumber - 1 Kg')]")).getText();
    	Assert.assertNotSame(strArg1, text);
    	
    }
    
    @Then("^Verify Selected \"([^\"]*)\" are displayed in checkout page $")
    public void verify_selected_something_are_displayed_in_checkout_page(String strArg1) throws Throwable {
    	
    	boolean text =driver.getPageSource().contains(strArg1);
    	Assert.assertTrue(text);
    }

    @And("^Add items to cart$")
    public void add_items_to_cart() throws Throwable {
    	
    driver.findElement(checkoutLocaters.Checkout).click();
    	
    }

    @And("^User process to checkout page$")
    public void user_process_to_checkout_page() throws Throwable {
    	
    	driver.findElement(checkoutLocaters.Cart).click();
    	Thread.sleep(2000);
    	driver.findElement(checkoutLocaters.ProceedToCheckout).click();;
    	
    }

}
