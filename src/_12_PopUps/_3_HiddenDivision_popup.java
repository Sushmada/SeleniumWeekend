package _12_PopUps;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _3_HiddenDivision_popup {
	static {
		System.setProperty("webdriver.chrome.driver", "./chromedrivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ixigo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//input[@data-rome-id='0']")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.className("ixi-icon-arrow rd-next")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.className("ixi-icon-arrow rd-next")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[text()='17'])[2]")).click();
		Thread.sleep(5000);
		
		driver.quit();
		
		

	}

}
