package _06_Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _2_NoSuchElement_Exception_forNotUsingPERFORM_Method {
	static {
		System.setProperty("webdriver.chrome.driver", "./chromedrivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.linkText("Fashion"));
		
		//creating object for Actions class
		//Actions class accepts driver(address of website) i,e driver
		Actions a = new Actions(driver);
		
		//mousehover action is performed using moveToElement method
		//Evrey methods in Actions class must end with perform() method
		//we will get exception if we dodnot use perform() method after the Actions class methods
		a.moveToElement(ele);
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Sneakers")).click();
		
		Thread.sleep(2000);
		driver.close();
		

	}

}
