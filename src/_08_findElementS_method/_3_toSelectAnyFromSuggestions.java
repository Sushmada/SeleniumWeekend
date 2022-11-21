package _08_findElementS_method;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _3_toSelectAnyFromSuggestions {
	static {
		System.setProperty("webdriver.chrome.driver", "./chromedrivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(By.name("q")).sendKeys("seleni");
		
		Thread.sleep(2000);
		
		//to find the Auto Suggestions having same attributes using findElements()
		List<WebElement> ele = driver.findElements(By.xpath("//li[@class='sbct']"));
		
		//clicking on the 8th suggestion using the index of the sugestions, index starts from 0
		ele.get(7).click();
		
		//NOTE: the Auto Suggestions order will not be same every time we execute the script
		
		Thread.sleep(2000);
		driver.close();

	}

}
