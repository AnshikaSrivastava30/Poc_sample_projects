package to_do_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class feeddata {
	public static void main(String args[]) {
				System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Drivers\\Chrome\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://todomvc.com/examples/angular2/");
	}
}
