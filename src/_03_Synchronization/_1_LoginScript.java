package _03_Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_LoginScript {
	
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
		
	    Thread.sleep(3000);
	    
	    //verification 
	    
	    String actual = driver.getTitle();
	    System.out.println("Actual Title:"+actual);
	    String expected = "actiTIME - Enter Time-Track";
	    System.out.println("Expected Title:"+expected);			    
	    
	    if(actual.equals(expected)) {
	    	System.out.println("PASS:Home Page is displayed");
	    }
	    
	    else {
	    	System.out.println("Falied:Username or Password is invalid. Please try again. is displayed");
	    }
	
	    Thread.sleep(2000);
	    
		driver.close();

}

}

