package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Homepage {
	WebDriver Driver;
	
	
	
	
	
	
	
	
	
	public Amazon_Homepage(WebDriver Driver) {
		this.Driver=Driver;
		PageFactory.initElements(Driver,this);
	}
}
