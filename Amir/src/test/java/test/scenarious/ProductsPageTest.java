package test.scenarious;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import METHODS.ProductsMethod;

public class ProductsPageTest extends LoginPageTest {
	ProductsMethod product;

	@Test(dependsOnMethods = {"login"})
	public void products() throws InterruptedException, AWTException {

		product = new ProductsMethod();
		product.movetoDesktops();
		product.clickIMac();
		product.clickImacAddcart();

		String comp_Msg_2 = product.getComparemessage();
		Reporter.log("IN Main" + comp_Msg_2, true);
		Reporter.log("Message should be: " + props.getProperty("verifyComMsgFor_iMac"), true);
		Assert.assertEquals(comp_Msg_2, props.getProperty("verifyComMsgFor_iMac"));
		product.contextClickNewTab();
		product.switchToChildTab();
		Assert.assertEquals(props.getProperty("ProductReview"), product.getProductReviewText());
		product.closeCurrentTab();
		product.switchToParentWindow();
		product.tablets();
		product.samsungAddtocart();

		String comp_Msg_3 = product.getComparemessage();
		Reporter.log("IN Main" + comp_Msg_3, true);
		Reporter.log("Message should be: " + props.getProperty("verifyComMsgFor_samsung"), true);
		Assert.assertEquals(comp_Msg_3, props.getProperty("verifyComMsgFor_samsung"));
		product.contextClickNewWindow();
		product.switchToChildTab();
		Assert.assertTrue(props.getProperty("ProductReview").contains(product.getProductReviewText()));
		product.closeCurrentTab();
		product.switchToParentWindow();

		List<WebElement> Items = driver.findElements(By.xpath("//*[@id=\"column-left\"]/div[1]/a"));
		for (WebElement e : Items) {
			if (e.getText().contains("0")) {
				Reporter.log("uavailable " + e.getText(), true);
			} else {
				Reporter.log("available " + e.getText(),true);
			}
		}
	}
}
