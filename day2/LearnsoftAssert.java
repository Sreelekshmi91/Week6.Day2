package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnsoftAssert {
	@Test
	public void leafTapsLogin() {
		// "Leaftaps - TestLeaf Automation Platform"
		String expectedTitle = "TestLeaf Automation Platform";
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String actualtitle = driver.getTitle();

		SoftAssert softAssert = new SoftAssert();

		System.out.println("Assertion1");
		softAssert.assertEquals(actualtitle, expectedTitle);

		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		System.out.println("Assertion2");

		// softAssert.assertTrue(displayed);
		softAssert.assertAll();
	}
}

// if (expectedTitle.equals(actualtitle)) {
// System.out.println("Title is matching");
//
// } else {
// System.out.println("Title is not matching");
//
// }
