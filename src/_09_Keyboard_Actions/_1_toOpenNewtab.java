package _09_Keyboard_Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_toOpenNewtab {
	static {
		System.setProperty("webdriver.chrome.driver", "./chromedrivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
					
			//in order to perform Keyboard actions we use, "ROBOT" Class
			//so creating object for Robot Class
			Robot r = new Robot();
					
			//VVV IMP NOTE: aftr using Keypress(), "KeyRelease()" is MUSTTTTT, else the system gets HANG
					
			//To open a new Tab in the browser
			//pressing cntrl key from keyboard
			r.keyPress(KeyEvent.VK_CONTROL);
			//pressing T from keyboard
			r.keyPress(KeyEvent.VK_T);
					
			//to relese the control key which is pressed
			r.keyRelease(KeyEvent.VK_CONTROL);
			//to relese the T key which is pressed
			r.keyRelease(KeyEvent.VK_T);
			
			Thread.sleep(2000);
			driver.close();
					
     		driver.quit();
				
	}

}
