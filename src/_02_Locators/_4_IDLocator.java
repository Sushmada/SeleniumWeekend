package _02_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _4_IDLocator {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./chromedrivers/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/W10-Lenovo/OneDrive/Desktop/Selenium%20weekend/locators.html");
		
		Thread.sleep(2000);
		
		 WebElement ele = driver.findElement(By.id("a2"));
		 ele.click();
		
		Thread.sleep(2000);
		driver.close();

	}

}
