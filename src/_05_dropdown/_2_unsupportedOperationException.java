package _05_dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _2_unsupportedOperationException {
	static {
		System.setProperty("webdriver.chrome.driver", "./chromedrivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/W10-Lenovo/OneDrive/Desktop/Selenium%20weekend/dropdown.html");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.id("taj"));
		
		//creating object for select class
		Select s = new Select(ele);
		
		//selecting an option from the dropdown
		s.selectByValue("444");
		Thread.sleep(2000);
		
		//trying to deselect all the options from the single select dropdown
		//throws an exception >> "UnsupportedOperationException"
		s.deselectAll();
		Thread.sleep(2000);
		
		driver.close();
	

	}

}
