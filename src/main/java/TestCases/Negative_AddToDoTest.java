package TestCases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import PageClasses.LandingPage;
import to_do_tests.driver_factory_config;
import to_do_tests.feeddata;

public class Negative_AddToDoTest extends driver_factory_config {
	LandingPage landingPage;

// Test 1 :: Add single Todo item
	@Test ( priority = 1 )
	public void AddSpaceAsTodoTest() throws InterruptedException {
		invokeBrowser("chrome");
		feeddata pageBase = new feeddata(driver, logger);
		PageFactory.initElements(driver, pageBase);
		landingPage = pageBase.OpenApplication();
		landingPage.todoAdd_SingleItem("                        ");
		Thread.sleep(10000);

	}
}
