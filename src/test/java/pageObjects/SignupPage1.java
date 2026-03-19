package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage1 extends BasePage{
	
	
	public SignupPage1(WebDriver driver) {
		super(driver);

		}
	//locators
	
	@FindBy(xpath="//*[@id=\"id_gender1\"]")
	WebElement radio_btn;
	
	@FindBy(xpath="//*[@id=\"uniform-id_gender2\"]")
	WebElement radio_btn1;
	
	@FindBy(xpath="//*[@id=\"name\"]")
	WebElement txt_usernm;
	
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement txt_email;
	
	@FindBy(css="#password")
	WebElement txt_psw;
	
	@FindBy(xpath="//*[@id=\"days\"]/option[12]")
	WebElement drp_downday;
	
	
	@FindBy(xpath="//*[@id=\"months\"]/option[8]")
	WebElement drp_downMnth;
	
	@FindBy(xpath="//*[@id=\"years\"]/option[23]")
	WebElement drp_year;
	
	@FindBy(xpath="//*[@id=\"newsletter\"]")
	WebElement chk_box1;
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div/div/form/div[7]/label")
	WebElement chk_box2;
	
	@FindBy(xpath="//*[@id=\"first_name\"]")
	WebElement txt_userfstname;
	
	@FindBy(xpath="//*[@id=\"last_name\"]")
	WebElement txt_userlstname;
	
	@FindBy(xpath="//*[@id=\"address1\"]")
	WebElement txt_address;
	
	@FindBy(xpath="//*[@id=\"company\"]")
	WebElement txt_companyname;
	
	@FindBy(xpath="//*[@id=\"country\"]/option[1]")
	WebElement drp_country;
	
	@FindBy(xpath="//*[@id=\"state\"]")
	WebElement txt_state;
	
	@FindBy(xpath="//*[@id=\"city\"]")
	WebElement txt_city;
	
	@FindBy(xpath="//*[@id=\"zipcode\"]")
	WebElement txt_zipcode;
	
	@FindBy(xpath="//*[@id=\"mobile_number\"]")
	WebElement txt_mobilenum;
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div/div/form/button")
	WebElement btn_createacc;
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div/h2/b")
	WebElement msg_conformation;
	
	//actions 
	public void radioButton() {
		radio_btn.click();
	}
	public void radioButton2() {
		radio_btn1.click();
	}
	
	public void userName(String name) {
		txt_usernm.sendKeys(name);
		
	}
	
	public void userEmail(String email) {
		txt_email.sendKeys(email);
		
	}
	
	public void userpwd(String psw) {
		txt_psw.sendKeys(psw);
	}
	
	public void dayDrp() {
		drp_downday.click();
	}
	
	public void monthDrp() {
		drp_downMnth.click();
	}
	
	public void yearDrp() {
		drp_year.click();
	}
	
	public void signUpchk() {
		chk_box1.click();
		
	}
	
	public void receivechk() {
		chk_box2.click();
		
	}
	
	public void userFirstnm(String fstname) {
		txt_userfstname.sendKeys(fstname);
		
	}
	public void userlastnm(String lastname) {
		txt_userlstname.sendKeys(lastname);
		
	}
	
	public void companyName(String comp) {
		txt_companyname.sendKeys(comp);
		
	}
	
	public void address(String add) {
		txt_address.sendKeys(add);
	}
	
	public void country() {
		drp_country.click();
	}
	
	
	public void stateNm(String state) {
		txt_state.sendKeys(state);
	}
	
	public void cityNm(String city) {
		txt_city.sendKeys(city);
	}
	
	public void Zipcode(String code) {
		txt_zipcode.sendKeys(code);
	}
	

	public void phoneNum(String number) {
		txt_mobilenum.sendKeys(number);
	}
	
	public void createAcc() {
		btn_createacc.click();
	}
	
	public String getConfirmationMsg() {
		try {
			return (msg_conformation.getText().toUpperCase());
		} catch (Exception e) {
			return (e.getMessage());

		}

	}

	
}
