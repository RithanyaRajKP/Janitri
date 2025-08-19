package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReckonLoginPage {
//	Declaration
//	@FindBy(xpath = "//img[@alt='logo']")
//	private WebElement logo;
	@FindBy(name = "user_name")
	private WebElement UN;
	@FindBy(name = "user_password")
	private WebElement pswd;
	@FindBy(id = "submitButton")
	private WebElement lognbtn;
	@FindBy(linkText = "Read License")
	private WebElement license;
	@FindBy(linkText = "Privacy Policy")
	private WebElement policy;
	
	
//	initialization
	public ReckonLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
//	getters used to call the private variables
	public WebElement getUN() {
		return UN;
	}

	public WebElement getPswd() {
		return pswd;
	}

	public WebElement getLognbtn() {
		return lognbtn;
	}

	public WebElement getLicense() {
		return license;
	}

	public WebElement getPlicy() {
		return policy;
	}
	
	
//	utilization businees logic
	public void loginFunc(WebDriver driver,String un,String pswd) {
		ReckonLoginPage lp = new ReckonLoginPage(driver);
		lp.getUN().sendKeys(un);;
		lp.getPswd().sendKeys(pswd);;
		lp.getLognbtn().click();
		
	}
	
//	hybrid drivern frmaework : more then 1 framework
//	method dreiven framework : 
//	data drivern frmaework : 
}
