package PRACTISE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UHC {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./chromedrivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://prod.member.myuhc.com/content/myuhc/en/public/member-ei-login.html");
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		driver.findElement(By.id("username")).sendKeys("belinda_001");
		driver.findElement(By.id("password")).sendKeys("Test2day");
		driver.findElement(By.id("submitBtn")).click();
		
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
		
		
		driver.close();

	}

}
