package com.Reckon.GenericLibrary;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;

import ObjectRepository.ReckonHomePage;
import ObjectRepository.ReckonLoginPage;

public class BaseClass {
	public static WebDriver driver;
	FileUtility f = new FileUtility();
	SeleniumUtilities s = new SeleniumUtilities();
	
	@BeforeSuite
	public void cennectToDatabase() {
		Reporter.log("database connected", true);
	}
	
//	@Parameter("browser")
	@BeforeTest
	public void launchBrowser(@Optional("chrome") String BROWSER) throws IOException {
		
		if(BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if (BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else if (BROWSER.equals("edge")) {
			driver = new EdgeDriver();
		}
		else {
			driver = new ChromeDriver();
		}
		
		s.maximizeBrowser(driver);
		s.minimizeBrowser(driver);
		String url = f.readDataFromPropertyFile("url");
		driver.get(url);  
//		Reporter.log("browser launched and navigated to application", true);
	}
	
	@BeforeMethod
	public void loginToViTiger() throws IOException, InterruptedException {
//		this needs to be added in the pom file
//		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
//		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("manager");
//		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		String un = f.readDataFromPropertyFile("username");
		String pswd = f.readDataFromPropertyFile("password");
		ReckonLoginPage r = new ReckonLoginPage(driver);
		r.loginFunc(driver, un, pswd);
		Reporter.log("login successfull", true);
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void logoutFromViTiger() throws InterruptedException {
		
//		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
//		Thread.sleep(3000);
		ReckonHomePage r = new ReckonHomePage(driver);
		r.signout(driver);
		Reporter.log("logout is successful", true);
	}
	
	@AfterTest
	public void closeBrowser() {
//		SeleniumUtilities s = new SeleniumUtilities();
		s.closeBrowser(driver);
		Reporter.log("browser closed successully", true);
	}
	
	@AfterSuite
	public void disconnectDatabase() {
		Reporter.log("disconected from the database successfully");
	}
}


// we are not getting the suggestions but we get suggestions under test/java 
//therefore we need to add testng forcefully by doing this : right click on project -> build path ->add libraries ->select TestNg ->Next-> finish