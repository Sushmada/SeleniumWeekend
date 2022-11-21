package _07_Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _1_switchToFrame_usingIndex_frameIndex {
	static {
		System.setProperty("webdriver.chrome.driver", "./chromedrivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//clicking on sign in in the parent page
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		
		
		//NOTE:how to find whether it is frame
		//Ans: On inspecting we will get options on FRAME also the code for FRAME starts with "iframe"
		
		
		//switching the control from parent page to the FRAME by using index 
		//since we have only one frame the index value will be 0
		driver.switchTo().frame(0);
		
		
		//NOTE: without switching the control to FRAME, if we try to perform action on the FRAME,
		//we will get "noSuchElementExpection" bcz the selenium will try to find the element in the parent page and unable to find
		
		
		//clicking on Google Play button by using contains() method on the FRAME 
		//since we found lot of white space in the element we inspect(Google Play), so by using text() it might cause error even if 
		//we miss single white space and also it occupies so much space in the eclipse
		//so we have used contains() 
		driver.findElement(By.xpath("//span[contains(text(),\"Google Play\")]")).click();
		
		
		Thread.sleep(5000);
		
		
		//to switch the control back to the parent page 
		driver.switchTo().defaultContent();
		
		//since we have used close(), the driver will close only that page in the control is present 
		driver.close();
		
		//in order to close whole application/website we use quit() method
		driver.quit();

	}

}
