package _05_dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _4_getOptions_method {
	static {
		System.setProperty("webdriver.chrome.driver", "./chromedrivers/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.id("gh-cat"));
		
		//creating object for the select class
		Select s = new Select(ele);
		
		//we use getOptions() method to get the options present in the dropdown
		//return type is list of web elements
		 List<WebElement> options = s.getOptions();
		 
		 //size() is used to get the count
		 int count = options.size();
		 System.out.println("count:"+count);
		 
		 // using for each loop to the options in the dropdown
		 for(WebElement b:options) {
			 System.out.println(b.getText());
		 }

		 Thread.sleep(2000);
		 driver.close();
	}

}
