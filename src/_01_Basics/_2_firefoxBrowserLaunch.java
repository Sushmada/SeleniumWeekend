package _01_Basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class _2_firefoxBrowserLaunch {
	
public static void main(String args[]) {
		
		String key = ("webdriver.gecko.driver");
		String value = ("./geckodrivers/geckodriver.exe");
		
		System.setProperty(key, value);
		
		FirefoxDriver driver = new FirefoxDriver();
		
	}

}
