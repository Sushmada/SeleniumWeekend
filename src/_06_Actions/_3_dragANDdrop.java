package _06_Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _3_dragANDdrop {
	static {
		System.setProperty("webdriver.chrome.driver", "./chromedrivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//in order to perform drag and drop action we need to specify the source and destination
		WebElement src = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement des = driver.findElement(By.xpath("//h1[text()='Block 4']"));
		
		//creating object for Actions class and passing the address of the website
		//address of website will be presentt in driver keyword used in the code
		Actions a = new Actions(driver);
		
		//performing drag and drop action on source and destination
		//i,e the element in the source is dragged and drop the element present in the
		//source to the destination
		//perform() at the end is must for the Actions class methods
		a.dragAndDrop(src, des).perform();
		
		Thread.sleep(5000);
		driver.close();
		

	}

}
