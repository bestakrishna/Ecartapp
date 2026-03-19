package pageObjects;
//using page factory 
// here we can avoid find element
// here tha way of constructing the constructor also different

import java.util.List;

import javax.lang.model.util.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	WebDriver driver;
	
	//constructor 
public	LoginPage1(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);//aply and intiate all the ele using driver **mandatory
		//while finding web ele driver mst be there we are not using FBE()
		
	}
	
	//https://automationexercise.com/login 
// finding the locators
	@FindBy(xpath="//*[@id=\"form\"]/div/div[1]/div[1]/div/form/input[2]")//find by findimg that ele 
	WebElement txt_Username;//returning that ele
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div[1]/div[1]/div/form/input[3]")
	WebElement txt_email_add;
	

	
	@FindBy(xpath="//*[@id=\"form\"]/div/div[1]/div[1]/div/form/input[3]")
	WebElement btn_login;
	
	//wrting locators for multipkle elements
	//@FindBy(tagName="@")
	//List<Elements> links;
	
	
	//creating action elements
	public void usernm(String user) {
		txt_Username.sendKeys(user);
	}
	public void useremail(String email) {
		txt_email_add.sendKeys(email);
	}
	public void enter() {
		btn_login.click();
	}
	
	

}
