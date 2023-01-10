package METHODS;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import page.objects.RegistrationPageNinja;

public class RegistrationPage {
	
	RegistrationPageNinja registerPage;

	public RegistrationPage(WebDriver driver) {

		registerPage = new RegistrationPageNinja(driver);
	}

	public void userRegistration(String firstname, String lastname, String useremail, String Telephone, String password,
			String confirmpass) {
		registerPage.getFirstnameTextfiled().clear();
		registerPage.getFirstnameTextfiled().sendKeys(firstname);
		Reporter.log("firstname is entered into testField\n");
		registerPage.getLastnameTextfield().clear();
		registerPage.getLastnameTextfield().sendKeys(lastname);
		Reporter.log("lastname is entered into testField");
		registerPage.getEmailidTextfield().clear();
		registerPage.getEmailidTextfield().sendKeys(useremail);
		Reporter.log("userEmail is entered into testField");
		this.registerPage.getTelephoneTextfield().clear();
		this.registerPage.getTelephoneTextfield().sendKeys(Telephone);
		Reporter.log("Telephone number entered in Testfield");
		this.registerPage.getPasswordTextfield().clear();
		this.registerPage.getPasswordTextfield().sendKeys(password);
		Reporter.log("Password entered in Testfield");
		this.registerPage.getConfirmpassTextfield().clear();
		this.registerPage.getConfirmpassTextfield().sendKeys(confirmpass);
		Reporter.log("Confirm Password entered in Testfield");

	}
	
	public String getRegisterSuccessfullMessageText() {
		return registerPage.getRegisterSuccessfullMessage().getText();
	}

	public void clickRegistrationButton() {
		registerPage.getRegisterButton().click();
		Reporter.log("Registration Button is clicked");
	}

	public void setCheckbox() {
		registerPage.getCheckbox().click();
	}

	public void clickMyaccount() {
		registerPage.getMyaccountButton().click();
	}

	public void clickLogout() {
		registerPage.getLogoutButton().click();

	}

	public String getRegisterErrorMessage() {
		return registerPage.getRegistrationerrorMessage().getText();
	}
	
	public void clickRegisterLink() {
		registerPage.getRegisterLink().click();
	}
}
