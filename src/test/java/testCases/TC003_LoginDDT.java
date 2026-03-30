package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountpage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC003_LoginDDT extends BaseClass {
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)// importing data providers because it is another class
	public void verifylogin_DDT(String email,String psw,String exp) {
		try {
		HomePage hp=new HomePage(driver);
		//
		hp.Myaccount();
		hp.Login();
		
		//login page
		
		LoginPage lp=new LoginPage(driver);
		
		lp.useremail(email);
		//Thread.sleep(4000);
		lp.userpsw(psw);
		lp.loginbtn();
		//myaccount page 
		
		MyAccountpage ma=new MyAccountpage(driver); 
		
		
	boolean targetPage=ma.isMyaccountPageExists();
	//Assert.assertEquals(targetPage, true,"Login failed");
	
	//validations 
	//data is valid --login success--test passs-logout
	//login failed --test fail
	//data is invalid --login success--test fail--logout
	//data is invalid --login failed--testpass
	
	
	//data is valid
	if(exp.equalsIgnoreCase("Valid")) {
		if(targetPage==true) {
			Assert.assertTrue(true);
			ma.myaccount();
			ma.logout(); 
		}
		else {
			Assert.assertTrue(false);
		}
	}
	
	if(exp.equalsIgnoreCase("invalid")) {
		if(targetPage==true) {
			ma.myaccount();
			ma.logout(); 
			Assert.assertTrue(false);
			
		}
		else {
			Assert.assertTrue(true);
		}
		
	}
		}catch(Exception e){
			Assert.fail();
			
		}
logger.info("********Finished test*****");

	//or
	//Assert.assertTrue(targetPage);
	
	
	}

}
