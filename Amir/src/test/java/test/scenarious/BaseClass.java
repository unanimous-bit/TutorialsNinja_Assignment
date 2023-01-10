package test.scenarious;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
	static WebDriver driver;
	static FileReader reader;
	static Properties props;

	public static WebDriver getdriver() {
		return driver;
	}

	@BeforeSuite // This annotated method will be run only once before all tests in this suite
					// have run.
	public void step0ReadConfig() throws IOException {
		System.out.println("1");
		Reporter.log("read config");
		try {
			reader = new FileReader(".//config.properties");
			props = new Properties();
			props.load(reader);
		} catch (FileNotFoundException e) {

		} catch (IOException e) {
			e.printStackTrace();
		}
		Reporter.log("OPENING URL IN THE BROWSER WINDOW ", true);
	}

	@BeforeTest // This annotated method is used to run once before the execution of all tests
				// in the suite is complete
	@Parameters("browserName")
	public void stepnoSetUp(String browserName) {
		Reporter.log("2" + browserName, true);
		if (browserName.equalsIgnoreCase("chrome")) {
			Reporter.log("BrowserName is " + browserName, true);
			System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("me")) {
			Reporter.log("BrowserName is " + browserName, true);
			System.setProperty("webdriver.edge.driver", ".//Drivers//msedgedriver.exe");
			driver = new EdgeDriver();
		}
	}

	@BeforeClass // This annotated method will be run only once before the first test method in
					// the current class is invoked.
	public void steptwoOpenBrowsers() {
		System.out.println("3");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(props.getProperty("WEBSITEREGISTERURL"));
		driver.manage().window().maximize();
	}

	@AfterTest // annotation used to run once after the execution of all tests in the suite is
				// complete
	public void TearDown() throws InterruptedException {

		driver.quit();// is used to quit the whole browser session along with all the associated
						// browser windows,tabs and pop-ups

	}
}
