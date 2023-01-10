package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPageNinja {

	WebDriver driver;

	public RegistrationPageNinja(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"input-firstname\"]")
	private WebElement firstnameTextfiled;

	@FindBy(xpath = "//*[@id=\"input-lastname\"]")
	private WebElement lastnameTextfield;

	@FindBy(xpath = "//*[@id=\"input-email\"]")
	private WebElement emailidTextfield;

	@FindBy(xpath = "//*[@id=\"input-telephone\"]")
	private WebElement telephoneTextfield;

	@FindBy(xpath = "//*[@id=\"input-password\"]")
	private WebElement passwordTextfield;

	@FindBy(xpath = "//*[@id=\"input-confirm\"]")
	private WebElement confirmpassTextfield;

	@FindBy(xpath = "//input[@name='agree']")
	private WebElement checkbox;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement registerButton;

	@FindBy(xpath = "//span[normalize-space()='My Account']")
	private WebElement myaccountButton;

	@FindBy(xpath = "//*[@id='top-links']/ul/li[2]/ul/li[5]/a")
	private WebElement logoutButton;

	@FindBy(xpath = "//*[@class='alert alert-danger alert-dismissible']")
	private WebElement registrationerrorMessage;

	@FindBy(xpath = "//h1[contains(text(),'Your Account Has Been Created!')]")
	private WebElement registerSuccessfullMessage;

	@FindBy(xpath = "//a[@class='list-group-item'][contains(text(),'Register')]")
	private WebElement registerLink;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstnameTextfiled() {
		return firstnameTextfiled;
	}

	public WebElement getLastnameTextfield() {
		return lastnameTextfield;
	}

	public WebElement getEmailidTextfield() {
		return emailidTextfield;
	}

	public WebElement getTelephoneTextfield() {
		return telephoneTextfield;
	}

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}

	public WebElement getConfirmpassTextfield() {
		return confirmpassTextfield;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

	public WebElement getMyaccountButton() {
		return myaccountButton;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public WebElement getRegisterSuccessfullMessage() {
		return registerSuccessfullMessage;
	}

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getRegistrationerrorMessage() {
		return registrationerrorMessage;
	}

}
