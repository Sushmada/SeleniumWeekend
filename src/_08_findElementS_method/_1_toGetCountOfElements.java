package _08_findElementS_method;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_toGetCountOfElements {
	static {
		System.setProperty("webdriver.chrome.driver", "./chromedrivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//typing seleni in the search bar
		driver.findElement(By.name("q")).sendKeys("seleni");
		
		Thread.sleep(2000);
		
		//findElements() method is used to locate multiple elements having same attributes
		//if all the elements have the same attributes then using findElement() we can locate only the first matching element
		//but if we use findElements() method then it will return ALL the matching elements
		List<WebElement> ele = driver.findElements(By.xpath("//li[@class='sbct']"));
		
		//to find the number of elements and printing the count
		int count = ele.size();
		System.out.println("Count:"+count);
		
		Thread.sleep(2000);
		driver.close();

	}

}
