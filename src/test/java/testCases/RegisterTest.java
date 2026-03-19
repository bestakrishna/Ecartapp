package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.RegisterPage;

public class RegisterTest {
	
	WebDriver driver;
	@BeforeClass
	void setup() throws InterruptedException {//this is for creating the broswer and lunching the broswer
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
	
		driver.manage().window().maximize();
	}
	@Test
	void testLogin() throws InterruptedException {// test loging main method this is login
		// calling the actions methods from the test method 
		// creating the obj for accessing the action methods 
		//creating with the Loginpage obj to access
		//here constructor with parameter
		RegisterPage reg = new RegisterPage(driver);
		Thread.sleep(5000);
		reg.Myaccount();
		reg.Register();
		reg.FirstName("Guru");
		reg.LastName("Charan");
		reg.Email("guru@gmail.com");
		reg.Telephone("123456789");
		reg.Password("Charan@123");
		reg.ConfirmPassword("Charan@123");
		reg.NewsLetterYes();
		reg.Privacy_Box();
		reg.Continue();
		
		//Thread.sleep(9000);
		
		// adding validation 	
		}
	
	@AfterClass
	void tearDown() {// logout method 
		driver.quit();
	}
}
