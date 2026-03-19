package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageEcart extends BasePage { //These classes extends from BasePage).
	
	public LoginPageEcart(WebDriver driver) {
		super(driver);//over rideing the basepage
		// TODO Auto-generated constructor stub
	}
//locators 
	
	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
	WebElement btn_signup;
	
@FindBy(xpath="//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")
WebElement txt_usrnm;

@FindBy(xpath="//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")
WebElement txt_password;

@FindBy(xpath="//*[@id=\"form\"]/div/div/div[1]/div/form/button")
WebElement btn_login;

public void signin() {
	btn_signup.click();
}
public void username(String user) {
	txt_usrnm.sendKeys(user);
}
public void password(String pass) {
	txt_password.sendKeys(pass);
}
public void login() {
	btn_login.click();
}
}
