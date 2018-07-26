package Framworktests;

import org.testng.annotations.Test;

import FrameworkPages.Homepage;
import FrameworkPages.Register;
import Utilitypackage.ExcelUtility;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import javax.servlet.Registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class Registrationtest {
	WebDriver d;
	Homepage h;
	Register r;
	ExcelUtility e;
	
  @Test
  public void f() throws IOException {
	  
	  h.clickRegister();
	  e.TestExcel();
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","Resources\\chromedriver.exe");
	  d =new ChromeDriver ();
	  d.get("http://demowebshop.tricentis.com/");
	//  h = new Homepage();
	  
	  //pagefacotory
	   h= PageFactory.initElements(d, Homepage.class);
	   
  r= PageFactory.initElements(d, Register.class);
  e=new ExcelUtility();
 
 

	   
	  }

  @AfterTest
  public void afterTest() {
  }

}
