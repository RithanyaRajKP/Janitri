package GenericLibrary;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import ObjectRepository.JanitriLoginPage;

public class BaseClass {
/*	steps followed 

	1. to handle the notification browser level alter used Robot class, therefore based on my browser icons I had to do few number of tab click extra
	2. All test cases got passed please find the link of the screen recording of the execution
	*/
	public static WebDriver driver;

	public static	FileUtility f ;
	JanitriLoginPage loginPg = new JanitriLoginPage(driver);
	boolean val = true;

	@BeforeSuite
	public void connectToDataBase() {
		Reporter.log("database connected", true);
	}

	@BeforeTest
	public void launchBrowser() throws IOException, AWTException, InterruptedException {
		driver = new ChromeDriver();
		f= new FileUtility();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		String url = f.readDataFromPropertyFile("url");
		driver.get(url);
		Robot robo = new Robot();
		 Thread.sleep(3000);
		robo.keyPress(KeyEvent.VK_SHIFT);
	    robo.keyPress(KeyEvent.VK_ALT);
	    robo.keyPress(KeyEvent.VK_T);
	    robo.keyRelease(KeyEvent.VK_T);
	    robo.keyRelease(KeyEvent.VK_ALT);
	    robo.keyRelease(KeyEvent.VK_SHIFT);
	    Thread.sleep(500);

	
	    robo.keyPress(KeyEvent.VK_TAB);
	    robo.keyRelease(KeyEvent.VK_TAB);
	    Thread.sleep(800);
	    robo.keyPress(KeyEvent.VK_TAB);
	    robo.keyRelease(KeyEvent.VK_TAB);
	    Thread.sleep(1000);
	    robo.keyPress(KeyEvent.VK_TAB);
	    robo.keyRelease(KeyEvent.VK_TAB);
	    Thread.sleep(1000);
	    robo.keyPress(KeyEvent.VK_TAB);
	    robo.keyRelease(KeyEvent.VK_TAB);
	    Thread.sleep(1000);
	    robo.keyPress(KeyEvent.VK_TAB);
	    robo.keyRelease(KeyEvent.VK_TAB);
	    Thread.sleep(1000);
	    robo.keyPress(KeyEvent.VK_TAB);
	    robo.keyRelease(KeyEvent.VK_TAB);
	    Thread.sleep(1000);
	    robo.keyPress(KeyEvent.VK_TAB);
	    robo.keyRelease(KeyEvent.VK_TAB);
	    Thread.sleep(1000);
	    robo.keyPress(KeyEvent.VK_TAB);
	    robo.keyRelease(KeyEvent.VK_TAB);
	    
	    robo.keyPress(KeyEvent.VK_ENTER);
	    robo.keyRelease(KeyEvent.VK_ENTER);
	    driver.navigate().refresh();
	    Thread.sleep(1000);
	    
		robo.keyPress(KeyEvent.VK_SHIFT);
	    robo.keyPress(KeyEvent.VK_ALT);
	    robo.keyPress(KeyEvent.VK_T);
	    robo.keyRelease(KeyEvent.VK_T);
	    robo.keyRelease(KeyEvent.VK_ALT);
	    robo.keyRelease(KeyEvent.VK_SHIFT);
	    Thread.sleep(1000);

	    robo.keyPress(KeyEvent.VK_TAB);
	    robo.keyRelease(KeyEvent.VK_TAB);
	    Thread.sleep(2000);

	    robo.keyPress(KeyEvent.VK_ENTER);
	    robo.keyRelease(KeyEvent.VK_ENTER);


	}

	@BeforeMethod
	public void loginToJanitri() {

	}

	@AfterMethod
	public void logOutFromJanitri() {

	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
		Reporter.log("browser closed", true);
	}

	@AfterSuite
	public void disconnectDatabase() {
		Reporter.log("database disconnected", true);
	}

}
