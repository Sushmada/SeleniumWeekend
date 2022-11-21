package _03_Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _3_ImplicitWait {
	
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
				
				//Implicit wait statement
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
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
			    
			  
			    driver.close();


	}


}
