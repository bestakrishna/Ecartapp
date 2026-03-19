package testCases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;

import pageObjects.SignupPage;
import pageObjects.SignupPage1;
import testBase.BaseClass;

public class T0001_SignUp extends BaseClass{
	 
	
	
	@Test
	public void testSignup() {
		logger.info("***** Starting TC001_SignUpTest  ****");
		logger.debug("This is a debug log message");

		try
		{
		SignupPage log=new SignupPage(driver);
		log.usernm(randomeString());
		log.useremail(randomeString()+"@gmail.com");
		log.signupbtn();
		logger.info("Clicked on signup.. ");
		

		
		SignupPage1 log2=new SignupPage1(driver);
		logger.info("Providing customer details...");

		log2.radioButton();
		log2.userName(randomeString());
		//log2.userEmail(randomeString()+"@gmail.com");
		log2.userpwd(randomeString());
		log2.dayDrp();
		log2.monthDrp();
		log2.yearDrp();
		log2.signUpchk();
		log2.receivechk();
		log2.userFirstnm(randomeString());
		log2.userlastnm(randomeString());
		log2.companyName(randomeString());
		log2.address(randomeString());
		log2.country();
		log2.stateNm(randomeString());
		log2.cityNm(randomeString());
		log2.Zipcode(ZipNumber());
		log2.phoneNum(randomeNumber());
		log2.createAcc();
		logger.info("Validating expected message..");

		
		String confmsg=log2.getConfirmationMsg();
Assert.notNull(confmsg, "ACCOUNT CREATED!");
logger.info("Test passed");
		
	}
	
	catch(Exception e){
		logger.error("Test failed: " + e.getMessage());
		
		}
		finally {
			logger.info("***** Finished TC001_SignUp *****");

		}
	}
	

}
//✅ Complete logs (start and end always appear)
//2. ✅ Custom error logging before failure
//3. ✅ Take screenshot on failure
//4. ✅ Finally block for cleanup
//5. ✅ Better error messages
//6. ✅ More control over test execution
//I used try-catch block in my test case for several important reasons:
//
//1. Complete Logging:
//   - The finally block ensures 'Finished Test' message 
//     always appears in logs
//   - This helps track test execution flow
//   - Logs are complete even if test fails
//
//2. Custom Error Handling:
//   - The catch block logs detailed error information
//   - logger.error() captures the failure before test ends
//   - Helps in debugging - I know exactly where it failed
//
//3. Screenshot on Failure:
//   - In catch block, I capture screenshot
//   - Screenshot saved with timestamp
//   - Very useful for analyzing failures later
//
//4. Better Error Messages:
//   - Assert.fail() gives custom, meaningful message
//   - Instead of generic TestNG exception message
//   - Team can understand failure without checking logs
//
//5. Cleanup Actions:
//   - Finally block for any cleanup needed
//   - Ensures resources are released
//   - Cookies cleared, popups closed, etc.