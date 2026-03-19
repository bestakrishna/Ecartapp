package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class SignupPage extends BasePage{
	
	
	public SignupPage(WebDriver driver){
		super(driver);
		
	}
	//locators 
	@FindBy(xpath="//*[@id=\"form\"]/div/div[1]/div[3]/div/form/input[2]")
	WebElement txt_username;
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div[1]/div[3]/div/form/input[3]")
	WebElement txt_useremail;
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div[1]/div[3]/div/form/button")
	WebElement btn_sign;
	
	//action class
	 public void usernm(String nm) {
		 txt_username.sendKeys(nm);
	 }
	public void useremail(String email) {
		txt_useremail.sendKeys(email);
	}
	public void signupbtn() {
		btn_sign.click();
	}
	
	

}
