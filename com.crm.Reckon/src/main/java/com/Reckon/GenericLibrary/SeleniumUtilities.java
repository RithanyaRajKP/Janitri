package com.Reckon.GenericLibrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
/**
 * @author RITHANYA RAJ K P
 * This class is a generic class which is used to design all the selenium utilities
 */
public class SeleniumUtilities {
	//public static WebDriver driver; // without extending to base class this is how we utilise the driver variable

	/**
	 * this method is a generic method used to maximize browser
	 * @param driver
	 */
	public void maximizeBrowser(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	
	/**
	 * this method is a generic method used to perform implicit wait
	 * @param driver
	 */
	public void minimizeBrowser(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	/**
	 * this method is a generic method used to perform mouse hover action
	 * @param driver
	 * @param address
	 */
	public void moveToElement(WebDriver driver,WebElement address) {
		Actions a = new Actions(driver);
		a.moveToElement(address).perform();
	}
	public void closeBrowser(WebDriver driver) {
		driver.quit();
	}
}
