package METHODS;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import page.objects.CartPageNinja;
import test.scenarious.BaseClass;

public class CartMethod {
	WebDriver driver;
	CartPageNinja cartPage;

	public void clickCartPage() {
		driver = BaseClass.getdriver();
		cartPage = new CartPageNinja(driver);
		cartPage.getCartpageButton().click();
		Reporter.log("Clicked on Cart Page", true);
	}

	public void clickCheckoutFromCart() {

		cartPage.getCheckoutFromCartButton().click();
		Reporter.log("Clicked on Checkout Page", true);
	}

	public void clickOnRemoveImacButton() {

		cartPage.getRemoveImacCrossButton().click();
		Reporter.log("Clicked on remove product iMac from Checkout Page\n", true);
	}

	public void clickCheckoutButton() {
		cartPage.getCheckoutButton().click();
		Reporter.log("Clicked on Checkout Page\n", true);
	}

	public String getProducNotAvailableText() {
		return cartPage.getProducNotAvailableText().getText();
	}

	public void screenshot(WebDriver driver) throws IOException {

		Date currentdate = new Date();
		System.out.println("currentdate");
		String screenshotfilename = ".//ssfolder//" + currentdate.toString().replace(" ", ",").replace(":", "-")
				+ ".png";
		Reporter.log(screenshotfilename, true);
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(screenshotfilename);
		FileUtils.copyFile(SrcFile, DestFile);
		Reporter.log("ScreenShot is Taken", true);

	}

}
