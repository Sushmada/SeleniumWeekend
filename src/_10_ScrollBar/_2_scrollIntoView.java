package _10_ScrollBar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2_scrollIntoView {
	static {
		System.setProperty("webdriver.chrome.driver", "./chromedrivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		WebElement ele = driver.findElement(By.xpath("(//a[@data-reactid='8'])[2]"));
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView()", ele);
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Gift Cards")).click();
		
		Thread.sleep(2000);
		driver.close();
	}

}
