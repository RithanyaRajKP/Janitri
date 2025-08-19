package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Reckon.GenericLibrary.SeleniumUtilities;

public class ReckonHomePage {

	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement profileicon;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signout;
	
    @FindBy(linkText = "Calendar")
    private WebElement cal;
    
    @FindBy(xpath = "//td[@class='tabSelected']/child::a")
    private WebElement leadselement;
    
    @FindBy(xpath = "//a[.='Organizations']")
    private WebElement orgelement;
    
    @FindBy(xpath = "//img[@title='Create Lead...']")
    private WebElement plusicon;
    
    public WebElement getPlusicon() {
		return plusicon;
	}

	//	Initialization
	public ReckonHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getCal() {
		return cal;
	}

	public WebElement getLeadselement() {
		return leadselement;
	}

	public WebElement getOrgelement() {
		return orgelement;
	}

	public WebElement getProfileicon() {
		return profileicon;
	}

	public WebElement getSignout() {
		return signout;
	}
//bussiness logic 
	public void signout(WebDriver driver) {
		SeleniumUtilities s =new SeleniumUtilities();
		ReckonHomePage r = new ReckonHomePage(driver);
		WebElement address = r.getProfileicon();
		s.moveToElement(driver, address);
		r.getSignout().click();
	}
	
	
	public void clickonLeads(WebDriver driver) throws InterruptedException {
		ReckonHomePage hp=new ReckonHomePage(driver);
		hp.getLeadselement().click();
		Thread.sleep(5000);
		
		
	}
	public void clickOnOrganization(WebDriver driver) {
		ReckonHomePage hp=new ReckonHomePage(driver);
		hp.getOrgelement().click();
		
	}
}
