package com.mycompany.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class LoginPage {
	
	public WebDriver driver;
	
	By email=By.cssSelector("#identifierId");
	
	////*[@id='uh-signin']
	By password=By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input");
	By submit=By.cssSelector("#identifierNext > content > span");
	By submit2=By.cssSelector("#passwordNext > content > span");
	//By submit2=By.xpath("//*[@id='passwordNext']/content/span]");
	////*[@id="passwordNext"]/content/span
	////*[@id='passwordNext']/content/span
	////*[@id="passwordNext"]/content/span  #passwordNext > content > span
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}

	public WebElement getEmail(){
		return driver.findElement(email);
		
	}
	public WebElement getPassword(){
		return driver.findElement(password);
		
	}
	
	public WebElement getSubmit(){
		return driver.findElement(submit);
		
	}
	public WebElement getSubmit2(){
		return driver.findElement(submit2);
		
	}
}
