package test.scenarious;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import METHODS.RegistrationPage;

public class RegistrationPageTest extends BaseClass {
	RegistrationPage registrationPageDetails;

	@Test(priority = 1, enabled = true)
	public void checkUserDetailspreExistsErrorMessage() throws InterruptedException {

		
		registrationPageDetails.clickRegisterLink();
		Reporter.log("Trying to register with existing details");
		registerDetails();
		Assert.assertEquals(props.getProperty("Registerpageerrormessage"), registrationPageDetails.getRegisterErrorMessage());
		Reporter.log(" Warning: E-Mail Address is already registered! is passed",true);
	}

	@Test(priority = 0, enabled = true)
	public void userRegister()  {
		
		registerDetails();
		Assert.assertEquals(props.getProperty("assertRegistration"),
				registrationPageDetails.getRegisterSuccessfullMessageText());
		registrationPageDetails.clickMyaccount();
		registrationPageDetails.clickLogout();

	}
	public void registerDetails() {
		registrationPageDetails = new RegistrationPage(driver);
		registrationPageDetails.userRegistration(props.getProperty("firstname"), props.getProperty("lastname"),
				props.getProperty("useremail"), props.getProperty("Telephone"), props.getProperty("password"),
				props.getProperty("confirmpass"));

		registrationPageDetails.setCheckbox();
		registrationPageDetails.clickRegistrationButton();
	}
}
