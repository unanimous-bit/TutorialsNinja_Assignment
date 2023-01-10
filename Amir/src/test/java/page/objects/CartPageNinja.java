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
	private WebElement CartpageButton;

	@FindBy(xpath = "//strong[normalize-space()='Checkout']")
	private WebElement CheckoutFromCartButton;

	@FindBy(xpath = "(//button[@type='button'])[10]")
	private WebElement RemoveImacCrossButton;

	@FindBy(xpath = "//a[@class='btn btn-primary']")
	private WebElement CheckoutButton;

	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	private WebElement CartPageMessage;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCartpageButton() {
		return CartpageButton;
	}

	public WebElement getCheckoutFromCartButton() {
		return CheckoutFromCartButton;
	}

	public WebElement getRemoveImacCrossButton() {
		return RemoveImacCrossButton;
	}

	public WebElement getCheckoutButton() {
		return CheckoutButton;
	}

	public WebElement getProducNotAvailableText() {
		return CartPageMessage;
	}

}
