package Framworktests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;

public class Logintest {
  @Test
  public void LoginValid() {
	  String ER= "Tested";
      String AR=  "Tested";	
      Assert.assertEquals(AR, ER);
	  
  }
      @Test
      public void LogInvalid() {
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
