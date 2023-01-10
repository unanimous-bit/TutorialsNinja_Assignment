package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPageNinja {
	WebDriver driver;

	public CartPageNinja(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "cart-total")
	private WebElement cartpageButton;

	@FindBy(xpath = "//strong[normalize-space()='Checkout']")
	private WebElement checkoutFromCartButton;

	@FindBy(xpath = "(//button[@type='button'])[10]")
	private WebElement removeImacCrossButton;

	@FindBy(xpath = "//a[@class='btn btn-primary']")
	private WebElement checkoutButton;

	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	private WebElement cartPageMessage;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCartpageButton() {
		return cartpageButton;
	}

	public WebElement getCheckoutFromCartButton() {
		return checkoutFromCartButton;
	}

	public WebElement getRemoveImacCrossButton() {
		return removeImacCrossButton;
	}

	public WebElement getCheckoutButton() {
		return checkoutButton;
	}

	public WebElement getProducNotAvailableText() {
		return cartPageMessage;
	}

}
