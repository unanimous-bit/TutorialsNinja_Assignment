package test.scenarious;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import METHODS.LoginMethod;

public class LoginPageTest extends BaseClass {
	static LoginMethod LoginPageOne;

	@Test
	public void login() {
		driver.get(props.getProperty("WEBSITELOGINURL1"));
		LoginPageOne = new LoginMethod(driver);
		LoginPageOne.sendDetails(props.getProperty("email"), props.getProperty("loginPassword"));
		LoginPageOne.clickLoginButton();
		Assert.assertEquals(props.getProperty("assertLogin"), LoginPageOne.getEditProfileText());
		Reporter.log(props.getProperty(LoginPageOne.getEditProfileText() + "Is Visible"), true);
		Reporter.log("Edit your account information", true);
	}
}