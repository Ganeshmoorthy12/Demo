package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Adactin.Baseclass.Basclas;

public class Login extends Basclas{
	
	public Login(WebDriver Xdriver) {
		this.driver = Xdriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement Userpassword;
	
	@FindBy(id="login")
	private WebElement Loginbutton;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getUserpassword() {
		return Userpassword;
	}

	public WebElement getLoginbutton() {
		return Loginbutton;
	}
	
}
