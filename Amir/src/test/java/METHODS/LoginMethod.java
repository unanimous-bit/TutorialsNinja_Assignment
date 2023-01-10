package METHODS;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import page.objects.LoginPageNinja;
import test.scenarious.BaseClass;

public class LoginMethod {

	WebDriver driver;
	LoginPageNinja loginPage;

	public LoginMethod(WebDriver driver) {

		this.driver = driver;
		loginPage = new LoginPageNinja(driver);
	}

	public void clickLoginButton() {
		driver = BaseClass.getdriver();
		loginPage = new LoginPageNinja(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(loginPage.getLoginButton()));
		loginPage.getLoginButton().click();
		Reporter.log("Login Button is clicked", true);
	}

	public void sendDetails(String email, String loginPassword) {

		loginPage.getEmailidTextfield().sendKeys(email);
		Reporter.log("Email is entered into textField", true);
		loginPage.getPasswordTextfield().clear();
		loginPage.getPasswordTextfield().sendKeys(loginPassword);
		Reporter.log("Password is entered into textField", true);
	}

	public String getEditProfileText() {
		return loginPage.getEditProfile().getText();
	}
	


}
