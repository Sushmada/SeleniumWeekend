package _01_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _3_CloseMethod {
	
public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./chromedrivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
