package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPageNinja {

	WebDriver driver;
	static int compCount = 0;
	String parentWindow;

	public ProductsPageNinja(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ul[@class='nav navbar-nav']/li/a[contains(text(),'Desktops')]")
	private WebElement hoverDesktopLink;

	@FindBy(xpath = "//a[normalize-space()='Mac (1)']")
	private WebElement macLink;

	@FindBy(xpath = "//span[normalize-space()='Add to Cart']")
	private WebElement imacAddtocartButton;

	@FindBy(xpath = "//i[@class='fa fa-home']")
	private WebElement homepageButton;

	@FindBy(xpath = "//a[normalize-space()='Tablets']")
	private WebElement tabletsButton;

	@FindBy(xpath = "//div[@class='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12']//button[1]")
	private WebElement samsungtabButton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement compareMessage;

	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div[2]/div[1]/h4/a")
	private WebElement iMacsave;

	@FindBy(xpath = "//a[contains(text(),'Reviews')]")
	private WebElement productReview;

	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div[2]/div[1]/h4/a")
	private WebElement samsungTabletsave;

	@FindBy(xpath = "//div[@class='caption']//a[contains(text(),'Samsung Galaxy Tab 10.1')]")
	private WebElement samsungtabletProductname;

	public WebDriver getDriver() {
		return driver;
	}

	public static int getCompCount() {
		return compCount;
	}

	public WebElement getHoverdesktopLink() {
		return hoverDesktopLink;
	}

	public WebElement getMacLink() {
		return macLink;
	}

	public WebElement getImacaddtocartButton() {
		return imacAddtocartButton;
	}

	public WebElement getHomepageButton() {
		return homepageButton;
	}

	public WebElement getTabletsButton() {
		return tabletsButton;
	}

	public WebElement getSamsungtabButton() {
		return samsungtabButton;
	}

	public WebElement getCompareMessage() {
		return compareMessage;
	}

	public WebElement getiMacsave() {
		return iMacsave;
	}

	public WebElement getProductReview() {
		return productReview;
	}

	public WebElement getSamsungTabletsave() {
		return samsungTabletsave;
	}

	public WebElement getSamsungtabletProductname() {
		return samsungtabletProductname;
	}
}
