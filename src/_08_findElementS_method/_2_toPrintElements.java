package _08_findElementS_method;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2_toPrintElements {
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
		
		List<WebElement> ele = driver.findElements(By.xpath("//li[@class='sbct']"));
		
		int count = ele.size();
		System.out.println("Count:"+count);
		System.out.println("-------------------------------");
		
		//to print all the elements i,e to print the Auto Suggestions
		for(int i=0;i<count;i++) {
			String text = ele.get(i).getText();
			System.out.println(text);
		}
		
		driver.close();

	}

}
