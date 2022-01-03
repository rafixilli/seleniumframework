package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.This;

public class Object_Login {
  WebDriver driver;
	
	public Object_Login(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@id='txtUsername']")
	WebElement usernameTextField;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	WebElement passwordTextField;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	WebElement loginButton;
	
	@FindBy(xpath="//a[@id='welcome']")
	WebElement verifylogin;
	
	
	
	public WebElement usernameTextField() {
		return usernameTextField;
	}
	public WebElement passwordTextField() {
		return passwordTextField;
	}
	
	public WebElement loginButton() {
		return loginButton;
	}
	
	public WebElement verifylogin() {
		return verifylogin;
	}

	
}
