package org.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.base.Base;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pom.GmailNewsFeed;
import org.pom.LoginPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GmailLogin extends Base{

	LoginPage page;
	GmailNewsFeed newsfeed ;
	WebDriverWait wait;
	@Given("^User Launch application$")
	public void user_Launch_application() throws Exception {
       getdriver("chrome", "https://accounts.google.com/ServiceLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false&flowName=GlifWebSignIn&flowEntry=AddSession");
	}

	@When("^User enters valid username and password$")
	public void user_enters_valid_username_and_password(DataTable testdata) throws Exception {
		 List<Map<String,String>> data = testdata.asMaps(String.class, String.class);
		 page = new LoginPage();
		 newsfeed = new GmailNewsFeed();
		 wait = new WebDriverWait(driver,10);
		 
		 Assert.assertEquals("Forgot email?", getTextByText(page.getLnkForgotEmail()));
         setText(page.getTxtEmailorPhone(), data.get(0).get("username"));
         System.out.println(data.get(0).get("username"));
         btnClick(page.getBtnLogin());
         driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
         
         wait.until(ExpectedConditions.visibilityOf(page.getLnkFogotPassword()));
         
		 Assert.assertEquals("Forgot password?", getTextByText(page.getLnkFogotPassword()));
         setText(page.getTxtPassword(), data.get(0).get("password"));
         System.out.println(data.get(0).get("password"));
         btnClick(page.getBtnLogin());
         driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
         
		 Assert.assertEquals("COMPOSE",getTextByText(newsfeed.getBtnCompose()));
    }

	@Then("^User logout the application$")
	public void user_logout_the_application() throws Exception {
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     btnClick(newsfeed.getImgSignOut());
     driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
     btnClick(newsfeed.getBtnSignOut());
     driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
     driver.close();
	}

	@When("^User enters Invalid username and password$")
	public void user_enters_Invalid_username_and_password(DataTable table) throws Exception {
		System.out.println("invalid");

	}

	@Then("^User Validate Error Message$")
	public void user_Validate_Error_Message() throws Exception {
       System.out.println("Error message");
	}


	@When("^User enters valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_valid_and(String username, String password) throws Exception {
		 page = new LoginPage();
		 newsfeed = new GmailNewsFeed();
		 wait = new WebDriverWait(driver,10);
		 
		 Assert.assertEquals("Forgot email?", getTextByText(page.getLnkForgotEmail()));
         setText(page.getTxtEmailorPhone(), username);
         btnClick(page.getBtnLogin());
         driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
         
         wait.until(ExpectedConditions.visibilityOf(page.getLnkFogotPassword()));
         
		 Assert.assertEquals("Forgot password?", getTextByText(page.getLnkFogotPassword()));
         setText(page.getTxtPassword(), password);
         btnClick(page.getBtnLogin());
	}

	@Then("^User close browser$")
	public void user_close_browser() throws Exception {

		driver.close();
	}

	
	
}
