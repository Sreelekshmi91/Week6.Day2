
package week5.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import week5.day1.ProjectSpecificMethods;

public class MergeLead extends ProjectSpecificMethods {
	// @BeforeTest
	@BeforeClass
	public void setFileName() {
		fileName = "tc003";
	}

	@Test(dataProvider = "testData")
	public void runMergeLead(String username, String password, String ID) throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Merge Leads")).click();

		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowHandlesList = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowHandlesList.get(1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[3]")).click();
		driver.switchTo().window(windowHandlesList.get(0));
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> towindowHandles = driver.getWindowHandles();
		List<String> towindowHandlesList = new ArrayList<String>(towindowHandles);
		driver.switchTo().window(towindowHandlesList.get(1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[2]")).click();
		driver.switchTo().window(towindowHandlesList.get(0));
		driver.findElement(By.linkText("Merge")).click();

		driver.switchTo().alert().accept();

		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(ID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		boolean displayed = driver.findElement(By.className("x-paging-info")).isDisplayed();
		Assert.assertTrue(displayed);
		// driver.close();

	}
}
