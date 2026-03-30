package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegisterPage;
import testBase.BaseClass;

public class TC001_RegisterTest extends BaseClass {
	
	
	@Test(groups={"Regression","Master"})
	void testLogin() throws InterruptedException {// test loging main method this is login
		// calling the actions methods from the test method 
		// creating the obj for accessing the action methods 
		//creating with the Loginpage obj to access
		//here constructor with parameter
		try {
		logger.info("*************Starting the test*************"); 
		HomePage lp2=new HomePage(driver);
		lp2.Myaccount();
		logger.info("Clicked on my account link");
		lp2.Register();// home page done
		RegisterPage reg = new RegisterPage(driver);
		Thread.sleep(5000);
		
		logger.info("Providing Customer details");
		reg.FirstName(randomeString());
		reg.LastName(randomeString());
		reg.Email(randomeString()+"@gmail.com");
		reg.Telephone(randomeNumber());
		String psw=randomAlphaNumeric();
		reg.Password(psw);
		reg.ConfirmPassword(psw);
		reg.NewsLetterYes();
		reg.Privacy_Box();
		reg.Continue();
		String cnfMsg=reg.getConfirmationMsg();
		if(cnfMsg.equals("Your Account Has Been Created!")) {
			Assert.assertTrue(true);
		}
		else {
			logger.error("Test failed");
			logger.debug("debug logs");
			Assert.assertTrue(false);
		}
		
		
		
		
		}catch(Exception e) {
			
			Assert.fail(); 
		}
		//Thread.sleep(9000);
		
		// adding validation 	
		}
	@AfterClass
	void tearDown() {
		driver.close();
	}
	//validating the msg 
	
	
}
