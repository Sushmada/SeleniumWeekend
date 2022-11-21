package _11_Screenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_myntraSS {
	static {
		System.setProperty("webdriver.chrome.driver", "./chromedrivers/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//updated statement of time out
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		TakesScreenshot t = (TakesScreenshot)driver;
		
		File src = t.getScreenshotAs(OutputType.FILE);
		
		File des = new File("./photo/myntra.png");
		
		FileUtils.copyFile(src, des);

		Thread.sleep(2000);
		driver.quit();
	}

}
