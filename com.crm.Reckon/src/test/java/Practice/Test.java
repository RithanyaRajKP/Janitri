package Practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;

import com.Reckon.GenericLibrary.BaseClass;
import com.Reckon.GenericLibrary.ExcelUtilities;
import com.Reckon.GenericLibrary.ListenerImplementation;

import ObjectRepository.ReckonHomePage;
import ObjectRepository.ReckonOrganizationPage;
@Listeners(ListenerImplementation.class)
public class Test extends BaseClass{
	
	@org.testng.annotations.Test
	public void ORG() throws EncryptedDocumentException, IOException, InterruptedException {
		ExcelUtilities e=new  ExcelUtilities();
		ReckonHomePage rh=new ReckonHomePage(driver);
		rh.clickOnOrganization(driver);
		String name = e.readDataFromExcel("Organization", 2, 0);
		String address = e.readDataFromExcel("Organization", 2, 1);
		String city = e.readDataFromExcel("Organization", 2, 2);
		String state = e.readDataFromExcel("Organization", 2, 3);
		String country = e.readDataFromExcel("Organization", 2, 4);
//		String country = e.readDataFromExcel("Organizatio", 2, 4); to throw error/failure
		ReckonOrganizationPage rp=new ReckonOrganizationPage(driver);
		rp.createOrganization(name, driver, address, city, state, country);
		Thread.sleep(4000);
	}
	
}
