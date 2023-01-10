package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageNinja {

	WebDriver driver;

	public LoginPageNinja(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "input-email")
	private WebElement EmailidTextfield;

	@FindBy(id = "input-password")
	private WebElement PasswordTextfield;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement LoginButton;

	@FindBy(xpath = "//*[@id='account-login']/div[1]")
	private WebElement LoginErrorMessage;

	@FindBy(xpath = "//a[contains(text(),'Edit your account information')]")
	private WebElement EditProfile;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmailidTextfield() {
		return EmailidTextfield;
	}

	public WebElement getPasswordTextfield() {
		return PasswordTextfield;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	public WebElement getEditProfile() {
		return EditProfile;
	}

//	public WebElement getLoginerrorMessage() {
//		return LoginErrorMessage;
//	}

}
