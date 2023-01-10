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
	private WebElement emailidTextfield;

	@FindBy(id = "input-password")
	private WebElement passwordTextfield;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButton;

	@FindBy(xpath = "//*[@id='account-login']/div[1]")
	private WebElement loginErrorMessage;

	@FindBy(xpath = "//a[contains(text(),'Edit your account information')]")
	private WebElement editProfile;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmailidTextfield() {
		return emailidTextfield;
	}

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getEditProfile() {
		return editProfile;
	}

}
