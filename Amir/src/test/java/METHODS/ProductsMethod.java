package METHODS;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import page.objects.ProductsPageNinja;
import test.scenarious.BaseClass;

public class ProductsMethod {
	WebDriver driver;
	String parentWindow;
	ProductsPageNinja productsPage;

	public void movetoDesktops() {
		driver = BaseClass.getdriver();
		productsPage = new ProductsPageNinja(driver);
		Actions ac1 = new Actions(driver);
		ac1.moveToElement(productsPage.getHoverdesktopLink()).perform();
		Reporter.log(">>>>>>>>>Moved to Desktop present in NAVIGATION\n", true);
	}

	public void clickIMac() {

		productsPage.getMacLink().click();
		Reporter.log(">>>>>>>>>Clicked on Mac\n", true);

	}

	public void clickImacAddcart() {

		productsPage.getImacaddtocartButton().click();
		Reporter.log(">>>>>>>>>Clicked on iMac add to cart button\n", true);

	}

	public void tablets() {

		productsPage.getTabletsButton().click();
		Reporter.log(">>>>>>>>>Clicked on Tablets Mobiles\n", true);
	}

	public void samsungAddtocart() {

		productsPage.getSamsungtabButton().click();
		Reporter.log(">>>>>>>>>Clicked on add to cart Samsung Galaxy Tab \n", true);
	}

	public String getComparemessage() throws InterruptedException {

		Thread.sleep(3000);
		Reporter.log("COMPARE MESSAGE: " + productsPage.getCompareMessage().getText(), true);
		Thread.sleep(3000);
		return productsPage.getCompareMessage().getText();
	}

	public void contextClickNewTab() throws AWTException, InterruptedException { // will perform keyboard actions to
																					// open in new tab
		Actions ac2 = new Actions(driver);
		ac2.contextClick(productsPage.getiMacsave()).perform();
		Thread.sleep(5000);
		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	public void contextClickNewWindow() throws AWTException, InterruptedException { // will perform keyboard actions to
																					// open in new window
		Actions ac2 = new Actions(driver);
		ac2.contextClick(productsPage.getiMacsave()).perform();
//		Thread.sleep(5000);
		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	public void switchToChildTab() { // this will switch to a new child tab and later will come to parent tab
		if (driver.getWindowHandles().size() > 1) {
			parentWindow = driver.getWindowHandle();
			Set<String> windowHandles = null;
			windowHandles = driver.getWindowHandles();

			for (String a : windowHandles) {
				if (!a.equals(parentWindow)) {
					driver.switchTo().window(a);

				}
			}
		} else {
			switchToChildTab(); 
		}
	}

	public void switchToParentWindow() { //// this will switch to a new window and later will come to parent window
		driver.switchTo().window(parentWindow);
	}

	public String getProductReviewText() {

		return productsPage.getProductReview().getText();
	}

	public String getSamsungtabletProductname() {
		return productsPage.getSamsungtabletProductname().getText();
	}

	public void closeCurrentTab() {
		driver.close();// will close the current window
	}
}
