package _06_Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _4_rightClick_or_ContextClick {
	static {
		System.setProperty("webdriver.chrome.driver", "./chromedrivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.name("q"));
		
		Actions a = new Actions(driver);
		
		//contextClick or Right click action is performed in order to get "Context Menu"
		//performing right click on the google search bar
		a.contextClick(ele).perform();
		
		Thread.sleep(2000);
		driver.close();
		


	}

}
