package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver) {
		super(driver);
	}
	//locators
	@FindBy(xpath="//*[@id=\"slider-carousel\"]/div/div[1]/div[1]/h1/span")
WebElement txt_Header;
	
//MyAccount page heading 
	
	
	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
	WebElement btn_logout;
	
	
	//actions methods
	
	public boolean isMypageExists() {
		try {
		return(txt_Header.isDisplayed());
		}catch(Exception e) {
			return (false);
		}
		
	}
	
	public void Logout() {
		btn_logout.click();
	}

	
}
