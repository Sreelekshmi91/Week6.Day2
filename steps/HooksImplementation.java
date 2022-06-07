package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksImplementation extends BaseClass {
	@Before
//	@BeforeMethod

	public void preCondition() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@After
	// @AfterMethod
	public void postCondition() {
		driver.close();

	}
}
