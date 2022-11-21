package _01_Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class _1_ChromeBrowserLaunch {
	
public static void main(String[] args) {
		
		String key = ("webdriver.chrome.driver");
		String value =("./chromedrivers/chromedriver.exe");

		
		System.setProperty(key, value);
		
		ChromeDriver driver = new ChromeDriver();


	}


}
