package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountpage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {
	
	
	@Test(groups={"Sanity","Master"})
	public void verifyLogin() {
		logger.info("****Login test Started****");
		try {
		//home page 
		HomePage hp=new HomePage(driver);
		//
		hp.Myaccount();
		hp.Login();
		
		//login page
		
		LoginPage lp=new LoginPage(driver);
		
		lp.useremail(p.getProperty("email"));
		Thread.sleep(4000);
		lp.userpsw(p.getProperty("password"));
		lp.loginbtn();
		//myaccount page 
		
		MyAccountpage ma=new MyAccountpage(driver); 
		
		
	boolean targetPage=ma.isMyaccountPageExists();
	//Assert.assertEquals(targetPage, true,"Login failed");
	//or
	Assert.assertTrue(targetPage);
	ma.myaccount();
	ma.logout();
	
	
	
		}
		catch(Exception e) {
			Assert.fail();
		}
		logger.info("*******Finished login**********");
	}
	

}
