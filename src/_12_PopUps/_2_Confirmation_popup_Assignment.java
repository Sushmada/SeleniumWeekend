package _12_PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _2_Confirmation_popup_Assignment {
	static {
		System.setProperty("webdriver.chrome.driver", "./chromedrivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		Actions a = new Actions(driver);
		
		//to locate the element
		WebElement ele = driver.findElement(By.id("course"));
		
		//to perform mousehover action
		a.moveToElement(ele).perform();
		
		//clicking on the "munit testing" on performing mousehover
		driver.findElement(By.xpath("//a[text()='munit testing ']")).click();
		
		Thread.sleep(2000);
		
		//locating the element("+") to add the count
		WebElement ele1 = driver.findElement(By.id("add"));
		
		//increasing the count by performing double click
		a.doubleClick(ele1).perform();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@ondblclick='addtocart()']")).click();
		Thread.sleep(2000);
		
		Alert a1 = driver.switchTo().alert();
		a1.dismiss();
		
		Thread.sleep(2000);
		driver.close();

	}

}
