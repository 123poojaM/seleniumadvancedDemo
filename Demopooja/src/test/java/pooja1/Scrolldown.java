package pooja1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Scrolldown {
	WebDriver driver;
  @Test
 
	  
	  public void javascript() throws AWTException{
			//driver.manage().window().maximize();
			JavascriptExecutor j=(JavascriptExecutor)driver;
			//j.executeScript("alert('Hello')");
			j.executeScript("window.scroll(0,800)");
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
	  driver =new ChromeDriver ();
		  driver.get(" https://www.timesjobs.com/candidate/register.html");
		  
  }

  @AfterTest
  public void afterTest() {
  }

}
