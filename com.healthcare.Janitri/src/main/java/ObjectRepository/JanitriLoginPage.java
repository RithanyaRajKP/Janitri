package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JanitriLoginPage {
//Declaration
	
	@FindBy(xpath = "//input[@id='formEmail']")
	private WebElement loginUserId;
	
	@FindBy(xpath = "//input[@id='formPassword']")
	private WebElement loginPassword;
	
	@FindBy(xpath = "//img[@class='passowrd-visible']")
	private WebElement loginPasswordEyeIcon;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//p[text() ='Invalid Credentials']")
	private WebElement warningMsg;
	
	@FindBy(xpath = "//label[text() = 'User ID']")
	private WebElement userIdLabel;
	
	@FindBy(xpath = "//label[text() = 'Password']")
	private WebElement passwordLabel;
	
	@FindBy(xpath = "//img[@alt='Janitri Logo']")
	private WebElement mainTitle;
	
	@FindBy(xpath = "//p[@class='sub-title']")
	private WebElement subTitle;
	
	@FindBy(xpath = "//div[@class='partner-and-supporter']")
	private WebElement bottomTitle;
	
		@FindBy(xpath = "//img[@src='./logos/cdcso-image.svg']")
	private WebElement topLeftLogo;
	
	@FindBy(xpath = "//img[@src='./logos/iso-image.svg']")
	private WebElement topRightLogo;
	
	@FindBy(xpath = "//div[@class='logo-track']")
	private WebElement logoTrack;
	
	
	public JanitriLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getLoginUserId() {
		return loginUserId;
	}
	public WebElement getWarningMsg() {
		return warningMsg;
	}


	public WebElement getLoginPassword() {
		return loginPassword;
	}


	public WebElement getLoginPasswordEyeIcon() {
		return loginPasswordEyeIcon;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public WebElement getUserIdLabel() {
		return userIdLabel;
	}


	public WebElement getPasswordLabel() {
		return passwordLabel;
	}


	public WebElement getMainTitle() {
		return mainTitle;
	}


	public WebElement getSubTitle() {
		return subTitle;
	}


	public WebElement getBottomTitle() {
		return bottomTitle;
	}


	public WebElement getTopLeftLogo() {
		return topLeftLogo;
	}


	public WebElement getTopRightLogo() {
		return topRightLogo;
	}


	public WebElement getLogoTrack() {
		return logoTrack;
	}


	
	
//	public void loginFunc(WebDriver driver,String uid,String pwd,boolean toggle) {
//		JanitriLoginPage loginPg = new JanitriLoginPage(driver);
//		loginPg.loginUserId.sendKeys(uid);
//		loginPg.loginPassword.sendKeys(pwd);
//		loginPg.loginButton.click();
//		if(toggle) {
//			loginPg.loginPasswordEyeIcon.click();
//		}
//	}
	public void loginUserId(WebDriver driver,String uid) {
		JanitriLoginPage loginPg = new JanitriLoginPage(driver);
		loginPg.loginUserId.sendKeys(uid);
	}
	
	public void loginPassword(WebDriver driver,String pwd) {
		JanitriLoginPage loginPg = new JanitriLoginPage(driver);
		loginPg.loginPassword.sendKeys(pwd);
	}
	
	public void loginEyeIcon(WebDriver driver) {
		JanitriLoginPage loginPg = new JanitriLoginPage(driver);
//		if(toggle) {
			loginPg.loginPasswordEyeIcon.click();
//		}
//		return !toggle;
	}
	
	public void loginSubmit(WebDriver driver) {
		JanitriLoginPage loginPg = new JanitriLoginPage(driver);
		loginPg.loginButton.click();
	}
	
	
}
