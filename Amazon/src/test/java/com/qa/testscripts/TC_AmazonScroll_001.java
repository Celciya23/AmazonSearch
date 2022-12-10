package com.qa.testscripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.qa.pages.Amazon_Homepage;

public class TC_AmazonScroll_001 extends TestBase {
	Amazon_Homepage amzpages;
	@Parameters({"Browser","Url"})
	@Test                             
	public void Search(String Browser,String Url) throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)Driver;
		js.executeScript("window.scroll(0,4000)"," ");
		Thread.sleep(4000);;
	}
}
