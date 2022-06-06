package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionfor5TestCases extends BaseClass {
	@Given("Enter the username as {string}")
	public void enter_the_username_as(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@Given("Enter the password as {string}")
	public void enter_the_password_as(String password) {
		driver.findElement(By.id("password")).sendKeys(password);

	}

	@When("Click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}

	@Then("Homepage should be displayed")
	public void homepage_should_be_displayed() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if (displayed) {
			System.out.println("Homepage displayed");
		} else {
			System.out.println("Homepage is not displayed");
		}
	}

	@When("Click on CRMSFA link")
	public void click_on_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();

	}

	@Then("My HomePage should be displayed")
	public void my_home_page_should_be_displayed() {
		boolean displayed = driver.findElement(By.xpath("//div[text()='My Home']")).isDisplayed();
		if (displayed) {
			System.out.println("My Homepage displayed");
		} else {
			System.out.println("My Homepage is not displayed");
		}
	}

	@When("Click on Lead")
	public void click_on_lead() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@When("Click on Merge Leads")
	public void mergeLeads() {
		driver.findElement(By.linkText("Merge Leads")).click();
	}

	@When("Click on Widget of From Lead and First Resulting Lead")
	public void widgetofFromLead() throws InterruptedException {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowHandlesList = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowHandlesList.get(1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[3]")).click();
		driver.switchTo().window(windowHandlesList.get(0));
		Thread.sleep(3000);
	}

	@When("Click on Widget of To Lead and Second Resulting Lead")
	public void widgetofToLead() throws InterruptedException {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> towindowHandles = driver.getWindowHandles();
		List<String> towindowHandlesList = new ArrayList<String>(towindowHandles);
		driver.switchTo().window(towindowHandlesList.get(1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[2]")).click();
		driver.switchTo().window(towindowHandlesList.get(0));
	}

	@When("Click on Merge button")
	public void mergeButton() {
		driver.findElement(By.linkText("Merge")).click();
	}

	@And("Accept the Alert")
	public void alert() {
		driver.switchTo().alert().accept();
	}

	@When("Click on Create Lead")
	public void click_on_create_lead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@When("Click on Find Leads")
	public void click_on_Find_leads() {
		driver.findElement(By.linkText("Find Leads")).click();
	}

	@When("Click on Phone")
	public void phone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}

	@Given("Enter the Phone Number1 as 9")
	public void phoneNumber1() {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9");

	}

	@Given("Enter the Phone Number as 9")
	public void phoneNumber() {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9");

	}

	@Given("Enter the Lead ID as {string}")
	public void click_on_lead_id1_as(String leadID) {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	}

	@When("Click on Find Leads1")
	public void find_leads1() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}

	@And("Thread")
	public void thread() throws InterruptedException {
		Thread.sleep(2000);
	}

	@When("Click on LeadID")
	public void leadID1() {
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	}

	@When("Click on Lead ID")
	public void leadID() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}

	@When("Click on Edit Lead")
	public void editLead() {
		driver.findElement(By.linkText("Edit")).click();
	}

	@Given("Update the Company Name as TCS")
	public void companyName() {
		WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys("TCS");
	}

	@When("Click on Duplicate Lead")
	public void duplicateLead() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
	}

	@Given("Enter the Company Name as {string}")
	public void enter_the_company_name_as(String CompanyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(CompanyName);

	}

	@Given("Enter the First Name as {string}")
	public void enter_the_first_name_as(String FirstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FirstName);

	}

	@Given("Enter the Last Name as {string}")
	public void enter_the_last_name_as(String LastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LastName);

	}

	@When("Click on Find Leads2")
	public void find_leads2() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}

	@Then("No records to display")
	public void no_records_to_display() {
		boolean displayed = driver.findElement(By.className("x-paging-info")).isDisplayed();
		if (displayed) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}

	@Then("Verify the title of the page")
	public void verify_the_title_of_the_page() {
		boolean displayed = driver.findElement(By.xpath("//div[text()='Find Leads']")).isDisplayed();
		if (displayed) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}

	@When("Click on submitButton")
	public void click_on_submit_button() {
		driver.findElement(By.name("submitButton")).click();

	}
}