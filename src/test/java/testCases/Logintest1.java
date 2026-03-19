package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.LoginPage1;

public class Logintest1 {
WebDriver driver;

@BeforeClass
public void setup() {
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://automationexercise.com/login");
	driver.manage().window().maximize();
	
}

@Test
void testLogin() throws InterruptedException {
	 LoginPage1 lp2=new LoginPage1(driver);
	 lp2.usernm("Krishna");
	 lp2.useremail("test123@gmail.com");
	 Thread.sleep(5000);
	 lp2.enter();
	
	}

@AfterClass
void tearDown() {
	driver.close();
	
}



}
