package PageObjectManager;

import org.openqa.selenium.WebDriver;

import Adactin.Baseclass.Basclas;
import Locators.Login;

public class PageObjectManager extends Basclas {
	
	public PageObjectManager(WebDriver Xdriver) {
	this.driver=Xdriver;
	
	}
	
	private Login Login;

}
