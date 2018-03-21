package org.pom;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base{
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="identifier")
	private WebElement txtEmailorPhone;
	
	@FindBy(xpath="//span[text()='Forgot email?']")
	private WebElement lnkForgotEmail;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement btnLogin;

	@FindBy(name="password")
	private WebElement txtPassword;
	
	@FindBy(xpath="//span[text()='Forgot password?']")
	private WebElement lnkFogotPassword;

	public WebElement getTxtEmailorPhone() {
		return txtEmailorPhone;
	}

	public WebElement getLnkForgotEmail() {
		return lnkForgotEmail;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getLnkFogotPassword() {
		return lnkFogotPassword;
	}
	
	
	
	
	
}
