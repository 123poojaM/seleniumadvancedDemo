package FrameworkPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register {
	WebDriver d;
	@FindBy(id="gender-female")
	static
	WebElement ChkBox_Gender;
	static
	
	@FindBy(id="FirstName")
	WebElement TxtBox_Firstname;
	static
	
	@FindBy(id="LastName")
	WebElement TxtBox_LastName;
	static
	
	@FindBy(id="Email")
	WebElement TxtBox_Email;
	static
	
	
	@FindBy(id="Password")
	WebElement TxtBox_Password;
	static
	
	@FindBy(id="ConfirmPassword")
	WebElement TxtBox_ConfirmPassword;
	static
	
	@FindBy(id="register-button")
	WebElement Btn_Register;
	
	
	public static void enterReg(String F,String L,String E, String P,String CP)
	{
	
		
		ChkBox_Gender.click();
		TxtBox_Firstname.sendKeys(F);
		
		TxtBox_LastName.sendKeys(L);
		TxtBox_Email.sendKeys(E);
		TxtBox_Password.sendKeys(P);
		TxtBox_ConfirmPassword.sendKeys(CP);
		Btn_Register.click();
		
	}
	
	public Register(WebDriver driver)
	{
		this.d=driver;
		
	}
	
	}


