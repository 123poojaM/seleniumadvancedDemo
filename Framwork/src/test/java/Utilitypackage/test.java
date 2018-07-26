package Utilitypackage;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class test {
	  @Test
	  public void LoginValid() {
		  String ER= "Tested";
	      String AR=  "Tested";	
	      Assert.assertEquals(AR,ER);
	  }
		  
	      
	      @Test
	      public void LoginInvalid() {
	    	  String ER= "Tested";
	          String AR=  "Tested123";	
	          Assert.assertEquals(AR, ER);
	  }
	  @BeforeSuite
	  public void beforeSuite() {
	  }

	  @AfterSuite
	  public void afterSuite() {
	  }

	}