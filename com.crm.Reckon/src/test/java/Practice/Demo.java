package Practice;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Reckon.GenericLibrary.BaseClass;
import com.Reckon.GenericLibrary.ListenerImplementation;

import ObjectRepository.ReckonHomePage;
@Listeners(ListenerImplementation.class)
public class Demo extends BaseClass {

	@Test
public void practice() throws InterruptedException {
		ReckonHomePage hp=new ReckonHomePage(driver);
		Thread.sleep(5000);
		hp.clickOnOrganization(driver);
		
		
	}
}
