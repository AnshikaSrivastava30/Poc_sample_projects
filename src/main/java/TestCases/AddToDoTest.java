package TestCases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import PageClasses.LandingPage;
import to_do_tests.driver_factory_config;
import to_do_tests.feeddata;

public class AddToDoTest extends driver_factory_config {
	LandingPage landingPage;
	feeddata datafeed;

// Test 1 :: Add single Todo item
	@Test ( priority = 1 )
	public void AddSingleItemTest() throws InterruptedException {
		invokeBrowser("chrome");
		feeddata pageBase = new feeddata(driver, logger);
		PageFactory.initElements(driver, pageBase);
		landingPage = pageBase.OpenApplication();
		landingPage.todoAdd_SingleItem("Testing");
		Thread.sleep(10000);

	}

//	// Test2 :: Add multiple todo items to the list
	@Test ( priority = 2 )
	public void AddMultipleItemTest() throws InterruptedException {
		invokeBrowser("chrome");
		feeddata pageBase = new feeddata(driver, logger);
		PageFactory.initElements(driver, pageBase);
		landingPage = pageBase.OpenApplication();
		List<String> todoItems = new ArrayList<String>();
		todoItems.add("Testing Test1");
		todoItems.add("Testing Test2");
		todoItems.add("Testing Test3");
		landingPage.todoAdd_MultipleItem(todoItems);
		Thread.sleep(10000);
	}
	
 // Test3 :: Clicks checkBox for todo item
	@Test ( priority = 3 )
	public void ClickToDoCheckBox() throws InterruptedException {
		invokeBrowser("chrome");
		feeddata pageBase = new feeddata(driver, logger);
		PageFactory.initElements(driver, pageBase);
		landingPage = pageBase.OpenApplication();
		List<String> todoItems = new ArrayList<String>();
		todoItems.add("Testing Test1");
		todoItems.add("Testing Test2");
		landingPage.todoAdd_MultipleItem(todoItems);
		landingPage.todo_Item_click();
		Thread.sleep(10000);
	}
	
//Test 4 :: clears completed item from todo item
		@Test ( priority = 4 )
		public void ClearCompletedToDo() throws InterruptedException {
			invokeBrowser("chrome");
			feeddata pageBase = new feeddata(driver, logger);
			PageFactory.initElements(driver, pageBase);
			landingPage = pageBase.OpenApplication();
			List<String> todoItems = new ArrayList<String>();
			todoItems.add("Testing Test1");
			todoItems.add("Testing Test2");
			landingPage.todoAdd_MultipleItem(todoItems);
			Thread.sleep(10000);
			landingPage.todo_Item_click();
			Thread.sleep(10000);
			landingPage.clearCompletedToDoItem();
			Thread.sleep(10000);
		}

//	//Always closes the browser in the end
////	@AfterMethod(alwaysRun = true)
////	public void afterTest() {
////		closeBrowser();
////	}
		
}
