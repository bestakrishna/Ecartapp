package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountpage extends BasePage {// to intilize the driver calling the base page 
	
public	MyAccountpage(WebDriver driver){
	 super(driver);// accessing parent from child
	  
	 }

//Locators 

@FindBy(xpath="//*[@id=\"content\"]/h2[1]")
WebElement msgheading;


@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a")
WebElement btn_myaccount;

@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")
WebElement btn_logout;

//acrion or validation

public boolean isMyaccountPageExists() {
	try {
	return(msgheading.isDisplayed());
	}catch(Exception e) {
		 return false;
	}
	
	
}

public void myaccount() {
	btn_myaccount.click();
	
}

public void logout() {
	btn_logout.click();
}

}
