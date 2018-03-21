package org.pom;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailNewsFeed extends Base{

	public GmailNewsFeed() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[text()='COMPOSE']")
	private WebElement btnCompose;

	@FindBy(xpath="//span[@class='gb_ab gbii']")
	private WebElement imgSignOut;
	
	@FindBy(xpath="//a[text()='Sign out']")
	private WebElement btnSignOut;
	
	
	public WebElement getImgSignOut() {
		return imgSignOut;
	}

	public WebElement getBtnSignOut() {
		return btnSignOut;
	}

	public WebElement getBtnCompose() {
		return btnCompose;
	} 
	
	
}
