package PageClasses;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import to_do_tests.feeddata;

public class LandingPage extends feeddata {

	public LandingPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
	}

	@FindBy(className = "new-todo")
	public WebElement TodoAdd;
	
	@FindBy(xpath = "//ul[@class='todo-list']//li[contains(.,'Testing Test2')]//input[@type='checkbox']")
	public WebElement checkboxClick;
	
	@FindBy(className = "clear-completed")
	public WebElement clearCompleted;

	public void todoAdd_SingleItem(String todoItem) {
		TodoAdd.sendKeys(todoItem);
		TodoAdd.sendKeys(Keys.ENTER);
		takeScreenShot();
	}

	public void todoAdd_MultipleItem(List<String> todoItems) {
		// TODO Auto-generated method stub
		for (int i = 0; i < todoItems.size(); i++) {
			TodoAdd.sendKeys(todoItems.get(i));
			TodoAdd.sendKeys(Keys.ENTER);
			takeScreenShot();
			
		}
	}
	
	public void todo_Item_click() {
		checkboxClick.click();
		takeScreenShot();
		
		}
	
	public void clearCompletedToDoItem() throws InterruptedException {
		clearCompleted.click();
		Thread.sleep(1000);
		takeScreenShot();
		}
	}

	
	

