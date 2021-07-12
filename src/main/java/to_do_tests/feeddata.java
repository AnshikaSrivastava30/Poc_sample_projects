package to_do_tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import PageClasses.LandingPage;
import utilities.DateUtil;


public class feeddata extends driver_factory_config{
	
	public ExtentTest logger;

	public feeddata(WebDriver driver, ExtentTest logger) {
		this.driver = driver;
		this.logger = logger;
	}
	
	/****************** OpenApplication ***********************/
	public LandingPage OpenApplication() {
		driver.get("https://todomvc.com/examples/angular2/");
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "Angular2 • TodoMVC");
		LandingPage landingPage = new LandingPage(driver, logger);
		PageFactory.initElements(driver, landingPage);
		return landingPage;
	}
	
	public void takeScreenShot() {
		TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
		File sourceFile = takeScreenShot.getScreenshotAs(OutputType.FILE);

		File destFile = new File(System.getProperty("user.dir") + "/ScreenShots/" + DateUtil.getTimeStamp() + ".png");
		try {
			FileUtils.copyFile(sourceFile, destFile);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
