package _02_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2_SameTagName {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./chromedrivers/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/W10-Lenovo/OneDrive/Desktop/Selenium%20weekend/locators.html");
		
		Thread.sleep(2000);
		
		//tagname to locate amazon link on the webpage created
		//it has the same tagname as google 
		//so the selenium will locate the first matching locator(Google) and never locate the 2nd element(Amazon) as it is having the same tagname
		//in order to overcome this we can use find element by classname
		 WebElement ele = driver.findElement(By.tagName("a"));
		 ele.click();
		
		Thread.sleep(2000);
		driver.close();


	}


}
