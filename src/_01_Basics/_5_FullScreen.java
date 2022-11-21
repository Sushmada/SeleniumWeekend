package _01_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _5_FullScreen {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./chromedrivers/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(2000);
		driver.close();

	}

}
