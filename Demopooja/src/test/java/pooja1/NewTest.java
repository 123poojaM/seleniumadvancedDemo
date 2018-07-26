package pooja1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class NewTest {
	  WebDriver driver;
  @Test
  public void f() throws InterruptedException, AWTException {
	  Actions a=new Actions(driver);
	  WebElement email=driver.findElement(By.id("emailAdd"));
	  
	  a.moveToElement(email).keyDown(email, Keys.SHIFT).sendKeys("newuser").build().perform();
	  driver.findElement(By.id("resumeFile_basic")).click();
	  
	  setClipboardData("C:\\Users\\pdc4-training.pdc4\\Desktop\\TestConditionsSample");
	  
	  Thread.sleep(3000);
	  Robot r=new Robot();
	  r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	
	
	 r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_PASTE);
	
  }
	public void javascript() throws AWTException{
		driver.manage().window().maximize();
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("alert('Hello')");
		j.executeScript("Window.scroll(0,800)");
		
		
	
	
	
  }
  @BeforeTest
  public void beforeTest() {
	 System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
	  driver =new ChromeDriver ();
	  driver.get(" https://www.timesjobs.com/candidate/register.html");
  } 
	  public static void setClipboardData(String string){
		  
		  StringSelection stringSelection=new StringSelection(string);
		  
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		  
	  }
	  
  
  
  
	  
	  
	  
	 
  

  @AfterTest
  public void afterTest() {
  }

}
