package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReckonOrganizationPage {

	@FindBy(xpath = "//img[@alt='Create Organization...']")
	private WebElement plusicon;
	
	@FindBy(name = "accountname")
	private WebElement orgname;
	
	@FindBy(name = "industry")
	private WebElement industrydrop;
	
	@FindBy(name = "bill_street")
	private WebElement billaddress;
	
	@FindBy(id = "bill_city")
	private WebElement billcity;
	
	@FindBy(id = "bill_state")
	private WebElement billstate;
	
	@FindBy(id = "bill_country")
	private WebElement billcountry;
	
	@FindBy(id = "phone")
	private WebElement phone ;
	
	@FindBy(name = "button")
	private WebElement savebtn;
	
	@FindBy(xpath = "//input[@value='Cancel  ']")
	private WebElement cancelbtn;
	
	@FindBy(xpath = "//input[@name='search_text']")
	private WebElement searchfield;
	
	@FindBy(xpath = "//input[@value=' Search Now ' and @name='submit']")
	private WebElement searchbtn;
	

	//initilization
	public  ReckonOrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getSearchfield() {
		return searchfield;
	}
	
	public WebElement getSearchbtn() {
		return searchbtn;
	}
	public WebElement getPlusicon() {
		return plusicon;
	}

	public WebElement getOrgname() {
		return orgname;
	}

	public WebElement getIndustrydrop() {
		return industrydrop;
	}

	public WebElement getBilladdress() {
		return billaddress;
	}

	public WebElement getBillcity() {
		return billcity;
	}

	public WebElement getBillstate() {
		return billstate;
	}

	public WebElement getBillcountry() {
		return billcountry;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public WebElement getCancelbtn() {
		return cancelbtn;
	}
	
	//bussiness logic
	public void createOrganization(String orgname,WebDriver driver,String address,String city,String state,String country) {
		ReckonOrganizationPage rp=new ReckonOrganizationPage(driver);
		rp.getPlusicon().click();
		rp.getOrgname().sendKeys(orgname);
		rp.getBilladdress().sendKeys(address);
		rp.getBillcity().sendKeys(city);
		rp.getBillstate().sendKeys(state);
		rp.getBillcountry().sendKeys(country);
	    rp.getSavebtn().click();
		
	}
	public void searchOrganization() {
		
	}
	
	
	 
}
