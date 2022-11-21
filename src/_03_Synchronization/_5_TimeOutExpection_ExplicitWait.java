package _03_Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _5_TimeOutExpection_ExplicitWait {
	
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
				//driver.findElement(By.id("username")).sendKeys("admin");
				
				//enter invalid username
				driver.findElement(By.id("username")).sendKeys("admin1");
				
				//enter password
				driver.findElement(By.name("pwd")).sendKeys("manager");
				
				//click on login
			    driver.findElement(By.xpath("//div[text()='Login ']")).click();
			    
			    //Explicit wait statement
			    WebDriverWait wait = new WebDriverWait(driver,5);
			    wait.until(ExpectedConditions.titleContains("Enter"));
				
			    String title = driver.getTitle();
			    System.out.println(title);
			    
			    Thread.sleep(3000);
			    
			    driver.close();


	}


}
