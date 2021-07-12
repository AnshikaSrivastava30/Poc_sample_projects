package to_do_tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utilities.ExtentReportManager;

public class driver_factory_config {
	
	public WebDriver driver;
	public ExtentReports report = ExtentReportManager.getReportInstance();
	public ExtentTest logger;

	/****************** Invoke Browser ***********************/
	public void invokeBrowser(String browserName) {

		try {

			if (browserName.equalsIgnoreCase("Chrome")) 
			{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\anshika.srivastava\\Downloads\\Automation-TestAuto-API-DRS (1)\\Automation-TestAuto-API-DRS\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("chrome set");
		}
		
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\anshika.srivastava\\Downloads\\Automation-TestAuto-API-DRS (1)\\Automation-TestAuto-API-DRS\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		} catch (Exception e) {
			// reportFail(e.getMessage());
			System.out.println(e.getMessage());
		}

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void flushReports() {
		report.flush();
		driver.close();
	}
			
}
