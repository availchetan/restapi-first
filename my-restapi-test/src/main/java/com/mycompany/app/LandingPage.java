package com.mycompany.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	//By loginLink= By.cssSelector("")	
	By loginLink= By.xpath("/html/body/nav/div/a[2]");
	
	//By email=By.cssSelector("#login-username"); @id='uh-signin'
	//By loginLink= By.cssSelector("#uh-signin"); //*[@id="uh-signin"] body > nav > div > a.gmail-nav__nav-link.gmail-nav__nav-link__sign-in
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}



	public WebElement getLogin()
	{
		return driver.findElement(loginLink);
	}

}
