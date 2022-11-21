package _05_dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _3_ebay_dropdown {
	static {
		System.setProperty("webdriver.chrome.driver", "./chromedrivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.id("gh-cat"));
		
		Select s = new Select(ele);
		
		s.selectByIndex(3);
		Thread.sleep(2000);
		
		s.selectByValue("14339");
		Thread.sleep(2000);
		
		s.selectByVisibleText("Travel");
		Thread.sleep(2000);
		
		driver.close();

	}

}
