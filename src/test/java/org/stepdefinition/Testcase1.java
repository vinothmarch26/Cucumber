package org.stepdefinition;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Testcase1 {

	@Before(order=0)
	public void beforelaunchBrowser() {
		System.out.println(" Before launch browser");
	}
			
	@Before("@home")
	public void homePage() {
		System.out.println("Home page");
	}
	
	@After("@home")
	public void logouPage() {
		System.out.println("LogoutPage");
	}
	
   @Before(order=1)
   public void launchBrowser() {
	  System.out.println(" launch browser");
   }
	
   @After(order=1)
   public void closeBrowser() {
	  System.out.println(" close browser");
   }

   @After(order=0)
   public void afterCloseBrowser() {
	 System.out.println("After close browser");
   }


@Given("^User Launch the Application$")
public void user_Launch_the_Application() throws Exception {

System.out.println(" vinoth");
}

@When("^User enter the Username and password$")
public void user_enter_the_Username_and_password() throws Exception {
	System.out.println(" vinoth");
}

@Then("^User close the Application$")
public void user_close_the_Application() throws Exception {
	System.out.println(" vinoth");
}

@When("^User enter the Username and password and designation$")
public void user_enter_the_Username_and_password_and_designation(DataTable arg1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
	System.out.println(" vinoth");
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
}

@When("^User enter \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enter_and(String arg1, String arg2) throws Exception {
	System.out.println(" vinoth");
}

	
	
}
