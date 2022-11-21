package _12_PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _4_FileUpload_popup {
	static {
		System.setProperty("webdriver.chrome.driver", "./chromedrivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://html.com/input-type-file/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\W10-Lenovo\\OneDrive\\Documents\\report_phase2 (1).pdf");
		
		Thread.sleep(2000);
		driver.quit();

	}

	
}
