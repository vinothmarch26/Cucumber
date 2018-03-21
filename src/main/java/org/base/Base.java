package org.base;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class Base {

	public static WebDriver driver;
	public static String path =System.getProperty("user.dir");
	public static String chrome = path+"/driver/chromedriver.exe"; 
	public static String firefox = path+"/driver/geckodriver.exe"; 
	public static String ie = path+"/driver/IEDriverServer.exe"; 
	
	public  WebDriver getdriver(String browser,String url) {
		switch(browser.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", chrome);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(url);
			break;
		case "firefox":
			System.setProperty("webdriver.firefox.driver", firefox);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(url);
			break;
		case "ie":
			System.setProperty("webdriver.ie.driver", ie);
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(url);
			break;
   		}
		return driver;
	}
	
	public String dbDataValue(int index,String name) throws Throwable {
		SqlData s = new SqlData();
		return s.data().get(index).get(name);
	}
	
	public String exDataValue(int index,String name) throws Throwable {
		ExcelData s = new ExcelData();
		return s.data().get(index).get(name);
	}
		
	public  void setText(WebElement element,String str) {
			element.sendKeys(str);
	}
	
	public  void btnClick(WebElement element) {
		element.click();
    }
	
	public void byVisibleText(WebElement ele,String name) {
		Select s = new Select(ele);
		s.selectByVisibleText(name);
	}
	
	public void radio_btn(List<WebElement> ele,int index){
		ele.get(index).click();
	}
	
	public String getTextByAttribute(WebElement ele) {
		return ele.getAttribute("value");
	}
	
	public String getTextByText(WebElement ele) {
		return ele.getText();
	}
}
