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

public class HomePage {
	WebDriver driver;
	
	//constructor 
public	HomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);//aply and intiate all the ele using driver **mandatory
		//while finding web ele driver mst be there we are not using FBE()
		
	}
	
	//https://automationexercise.com/login 
// finding the locators

	
	//wrting locators for multipkle elements
	//@FindBy(tagName="@")
	//List<Elements> links;
	
@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a/span[2]")
WebElement btn_Myacc;

@FindBy(xpath="//a[normalize-space()='Register']")
WebElement btn_Reg;

@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
WebElement btn_login;
	//creating action elements
	
public void Myaccount() {
	btn_Myacc.click();
}

public void Register() {
	btn_Reg.click();
}

public void Login() {
	btn_login.click();
}
	
	

}
