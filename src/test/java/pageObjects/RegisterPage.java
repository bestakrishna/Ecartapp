package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//without using page factory
public class RegisterPage extends BasePage {
	//WebDriver driver;// class variable can access the in the methods 
// creating the constructor to intiallize the driver
public RegisterPage(WebDriver driver){//we will pass parameter from the testcase 
		super(driver);//invoke with obj in another class 
		
	}
		//Locators
@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a/span[2]")
WebElement btn_Myacc;

@FindBy(xpath="//a[normalize-space()='Register']")
WebElement btn_Reg;
	
@FindBy(xpath="//*[@id=\"input-firstname\"]")
WebElement txt_userfstname;
	
@FindBy(xpath="//*[@id=\"input-lastname\"]")
WebElement txt_userlstname;
	
@FindBy(xpath="//*[@id=\"input-email\"]")
WebElement txt_useremail;

@FindBy(xpath="//*[@id=\"input-telephone\"]")
WebElement tele_phone;

@FindBy(xpath="//*[@id=\"input-password\"]")	
WebElement txt_password;

@FindBy(xpath="//*[@id=\"input-confirm\"]")
WebElement txt_cnfpassword;

@FindBy(xpath="//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input")
WebElement radiobtn_yes;

@FindBy(xpath="//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input")
WebElement radiobtn_no;

@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[1]")
WebElement chk_box;

@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[2]")
WebElement btn_conti;
	 
	
	// Action methods 
	// creating the methods for each action
	// this will internally invoke the elaments and  perform the actions
	
public void Myaccount() {
	btn_Myacc.click();
}

public void Register() {
	btn_Reg.click();
}

public void FirstName(String userfstnm) {
	txt_userfstname.sendKeys(userfstnm);
}

public void LastName(String userlastnm) {
	txt_userlstname.sendKeys(userlastnm);
}

public void Email(String email) {
	txt_useremail.sendKeys(email);
}
public void Telephone(String phoneNo) {
	tele_phone.sendKeys(phoneNo);
}
public void Password(String psw) {
	txt_password.sendKeys(psw);
}

public void ConfirmPassword(String cnfpsw) {
	txt_cnfpassword.sendKeys(cnfpsw);
}

public void NewsLetterYes() {
	radiobtn_yes.click();
}
 public void NewsLetterNo() {
	 radiobtn_no.click();
 }
 
 public void Privacy_Box() {
	 chk_box.click();
 }
 
 public void Continue() {
	 btn_conti.click();
	 
 }

}
