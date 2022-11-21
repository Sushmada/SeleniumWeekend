package _07_Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2_switchToFrame_usingWebElementAddress {
	static {
		System.setProperty("webdriver.chrome.driver", "./chromedrivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();

		//storing the address of web element in a variable
		WebElement ele = driver.findElement(By.xpath("//iframe[@scrolling='no']"));
		
		//switching the control to the frame using address of web element
		driver.switchTo().frame(ele);
		
		//NOTE: Generally we don't jave ID in the frame and also we dont prefer using ID
		
		//clicking on Google Play button by using contains() method on the FRAME 
		driver.findElement(By.xpath("//span[contains(text(),\"Google Play\")]")).click();

		Thread.sleep(2000);
		driver.quit();
	}

}
