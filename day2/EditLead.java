package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EditLead extends ProjectSpecificMethods {
	// @BeforeTest

	@BeforeClass

	public void setFileName() {
		fileName = "tc002";
	}

	@Test(dataProvider = "testData")

	public void runEditLead(String username, String password, String phonenumber, String companyName)
			throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phonenumber);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement company_Name = driver.findElement(By.id("updateLeadForm_companyName"));
		company_Name.clear();
		company_Name.sendKeys(companyName);
		driver.findElement(By.name("submitButton")).click();
		// driver.close();
	}

}