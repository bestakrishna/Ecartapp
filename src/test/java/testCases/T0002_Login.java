package testCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPageEcart;
import testBase.BaseClass;

public class T0002_Login extends BaseClass {
	
	@Test
	public void testlogin() {
		
		logger.info("Test start here");
		try {
		
		//login page
		LoginPageEcart log=new LoginPageEcart(driver);
		
		log.signin();
		
		log.username(p.getProperty("email"));
		log.password(p.getProperty("password"));
		log.login();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		log.login();
		log.login();
		log.login();
		log.login();
		
		
		
		
		//home page
		HomePage hm=new HomePage(driver);
		boolean page=hm.isMypageExists();
		Assert.assertEquals(page, true,"login failed");//validating the home page 
		hm.Logout();
		
		}
		catch(Exception e) {
			Assert.fail();
		}
		logger.info("-----**test finshed");
		
		
	}
	
}
