package _05_dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _1_singleSelectDropdown_methods {
	static {
		System.setProperty("webdriver.chrome.driver", "./chromedrivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/W10-Lenovo/OneDrive/Desktop/Selenium%20weekend/dropdown.html");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.id("taj"));
		
		//Select class has the following methods and in order to use those we should create object for select class
		//and select class object accepts only the address of the web element
		//always import the "Select" class from the package with has "support.ui"
		Select s = new Select(ele);
		
		s.selectByIndex(1);
		Thread.sleep(2000);
		
		s.selectByValue("444");
		Thread.sleep(2000);
		
		s.selectByVisibleText("dosa");
		Thread.sleep(2000);
		
		driver.close();

	}

}
