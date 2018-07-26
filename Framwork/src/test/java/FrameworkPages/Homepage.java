package FrameworkPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {
	WebDriver d;
	@FindBy(linkText="Register")
    WebElement LinkReg;

public void clickRegister()
{
	LinkReg.click();
}

public Homepage(WebDriver driver)
{
	this.d=driver;
	
	
	
}
}
