package test.scenarious;

import java.io.IOException;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import METHODS.CartMethod;

public class CartPageTest extends ProductsPageTest {
	static CartMethod cart;

	@Test(dependsOnMethods = { "products" }, description = "This test is for cart page")
	public void CartPage() {
		cart = new CartMethod();

		cart.clickCartPage();
		cart.clickCheckoutFromCart();
		cart.clickOnRemoveImacButton();
		cart.clickCheckoutButton();
		System.out.println("checking stock availability" + cart.getProducNotAvailableText());
		Assert.assertEquals(props.getProperty("CartPageMessageItem"), cart.getProducNotAvailableText());
		Reporter.log("  Products marked with *** are not available in the desired quantity or not in stock!" + "",
				true);

	}

	@Test(description = "This test is for sceenshot")
	public void screenshot() throws IOException {
		if (cart == null) {
			cart = new CartMethod();
		}
		cart.screenshot(driver);
		Reporter.log("Browser is closed", true);
	}
}