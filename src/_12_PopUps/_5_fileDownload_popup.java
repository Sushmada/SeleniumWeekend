package _12_PopUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _5_fileDownload_popup {
	static {
		System.setProperty("webdriver.chrome.driver", "./chromedrivers/chromedriver.exe");
		
		String key = ("webdriver.gecko.driver");
		String value = ("./geckodrivers/geckodriver.exe");
		
		System.setProperty(key, value);
		
	}

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://html.com/input-type-file/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//now file download popup has been removed even in firefox browser.
		//should use ""Robot"" class in order to do it manually.

	}

}
