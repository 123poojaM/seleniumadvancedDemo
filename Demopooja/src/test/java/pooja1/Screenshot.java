package pooja1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Screenshot {
	static WebDriver driver;
	static int counter=1;
  @Test
  public void f() throws IOException {
	  
	  takesScreenshot();
	  takesScreenshot(); 
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
	  driver =new ChromeDriver ();
	  driver.get(" https://www.timesjobs.com/candidate/register.html");
	  
  }
	  public static void takesScreenshot() throws IOException {
		  TakesScreenshot t=(TakesScreenshot)driver;
		  File f=t.getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(f,  new File("C:\\Users\\pdc4-training.pdc4\\Desktop\\Pooja\\pooja1"+counter+timestamp()+".jpg"));
		  counter=counter+1;
		  
	    
		  
	  }
	  
	  public static String timestamp() {
	        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}
  

  @AfterTest
  public void afterTest() {
  }

}
