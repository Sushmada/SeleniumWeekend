package _10_ScrollBar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_toScrollTheWebPage {
	static {
		System.setProperty("webdriver.chrome.driver", "./chromedrivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		// ????
		JavascriptExecutor j = (JavascriptExecutor)driver;
		
		//Scrolling down giving x and y axes
		j.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		
		//Scrolling up by giving x and y axes
		j.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
