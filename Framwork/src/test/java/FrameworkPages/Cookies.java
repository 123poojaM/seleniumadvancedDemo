package FrameworkPages;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeTest;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Cookies {
	WebDriver d;
  @Test
  public void deletecookies() {
	  
	  d.manage().deleteAllCookies();
	  Cookie c= new Cookie("test","Mycookies");
	  d.manage().addCookie(c);
	
	  Set<Cookie> myset= d.manage().getCookies();
	  for(Cookie s:myset)
	  {
		  System.out.println(s.getName());
		  System.out.println(s.getPath());
		  System.out.println(s.getDomain());
		  
	  }
	  
	  
  }
  @BeforeTest
   public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		d  =new ChromeDriver ();
		d.get("https://www.timesjobs.com/candidate/register.html");
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
