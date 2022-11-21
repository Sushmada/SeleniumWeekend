package _03_Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2_SynchronizationExpection_NoSuchElementExpection_ImplicitWait {
	
static {
		
		System.setProperty("webdriver.chrome.driver", "./chromedrivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		//launching browser
		WebDriver driver = new ChromeDriver();
		
		//enter url
		driver.get("https://demo.actitime.com/login.do");
		
		Thread.sleep(4000);
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//enter valid username
		driver.findElement(By.id("username")).sendKeys("admin");
		
		//enter invalid username
		//driver.findElement(By.id("username")).sendKeys("admin1");
		
		//enter password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		//click on login
	    driver.findElement(By.xpath("//div[text()='Login ']")).click();
			    
	    //to click on Reports
	    driver.findElement(By.id("container_reports")).click();
	    
	    //selenium is unable to locate "Reports" element as the selenium is faster than the browser, 
	    //as the browser is loading slow than the selenium and selenium is trying to find the element before the element is loaded
	    //we are getting an EXCEPTION called "NoSuchElementException"
	    // So in order to overcome this we use ""Wait"" Statements
	    // classified into 2 types namely 1.Implicit wait 2.Explicit wait 
	    
	    driver.close();

	}


}
