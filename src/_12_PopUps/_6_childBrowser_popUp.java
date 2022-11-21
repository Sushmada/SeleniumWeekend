package _12_PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _6_childBrowser_popUp {
	static {
		System.setProperty("webdriver.chrome.driver", "./chromedrivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,200)");
		
		driver.findElement(By.id("newWindowBtn")).click();
		
		String parentAddress = driver.getWindowHandle();
		System.out.println(parentAddress);
		
		Set<String> AllAddress = driver.getWindowHandles();
		System.out.println(AllAddress);
		
		int count = AllAddress.size();
		System.out.println(count);
		
		Thread.sleep(2000);
		driver.quit();

	}

}
