package _12_PopUps;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_Alert_Confirmation_Javascript_popups {
	static {
		System.setProperty("webdriver.chrome.driver", "./chromedrivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.javascriptkit.com/javatutors/alert2.shtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		
		driver.findElement(By.name("B2")).click();
		
		Alert a = driver.switchTo().alert();
		
		String text = a.getText();
		System.out.println(text); //text gets prints on the Console
		
		Thread.sleep(2000);
		a.accept();
		a.dismiss(); // will get expection as there is no alert present once after accepting and 
		             // we can't use both accept and dismiss at a time
		
		Thread.sleep(2000);
		driver.quit();

	}

}

