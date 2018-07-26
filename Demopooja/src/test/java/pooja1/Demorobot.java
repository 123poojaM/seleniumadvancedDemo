package pooja1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Demorobot {
	  WebDriver driver;
  @Test
  public void robotclass() throws AWTException {
	  
	  
	  Robot r=new Robot();
	  r.keyPress(KeyEvent.VK_WINDOWS);
	  r.keyRelease(KeyEvent.VK_WINDOWS);
	  
	 // r.keyPress(KeyEvent.VK_CAPS_LOCK);
	  
}
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
	  driver =new ChromeDriver ();
	 // driver.get(" https://www.timesjobs.com/candidate/register.html");
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
