package _01_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _8_MyntraUrl {
	
static {
		
		System.setProperty("webdriver.chrome.driver", "./chromedrivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		Thread.sleep(4000);
		
		driver.close();

	}

}
