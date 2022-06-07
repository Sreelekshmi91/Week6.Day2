package week5.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadExcelData1;

public class ProjectSpecificMethods extends BaseClass {

	public String fileName;

	@DataProvider
	public String[][] testData() throws IOException {
		String[][] data = ReadExcelData1.readData(fileName);
		return data;
	}

	@Parameters({ "browserName", "URL" })
	@BeforeMethod

	public void startBrowser(String browserName, String url) {
		if (browserName.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@AfterMethod
	public void endBrowser() {

	}
}