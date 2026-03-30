package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	
	//locators 
	
	@FindBy(xpath="//*[@id=\"input-email\"]")
	WebElement setemail;
	
	@FindBy(xpath="//*[@id=\"input-password\"]")
	WebElement setpsw;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/input")
	WebElement btn_login;
	
	
	//action elements
	
	public void useremail(String email) {
		setemail.sendKeys(email);
	}
	
	public void userpsw(String psw) {
		setpsw.sendKeys(psw);
	}
	
	public void loginbtn() {
		 btn_login.click();
	}
}
