package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAssertion {
	@Test
	public void leafTapsLogin() {
		// "Leaftaps - TestLeaf Automation Platform"
		String expectedTitle = "Leaftaps - TestLeaf Automation Platform";
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, expectedTitle);

		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		Assert.assertTrue(displayed);
		// Assert.assertFalse(displayed);

		// if (expectedTitle.equals(actualtitle)) {
		// System.out.println("Title is matching");
		//
		// } else {
		// System.out.println("Title is not matching");
		//
		// }
	}
}