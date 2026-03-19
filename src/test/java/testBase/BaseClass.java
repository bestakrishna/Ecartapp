package testBase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileReader;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;//log4j
import org.apache.logging.log4j.Logger;   //log4j
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	// these files are reusability files  
public	WebDriver driver;
public Logger logger;//this is for log4j to create reports 
public Properties p;

	@BeforeClass
	@Parameters({"os","broswer"})//this is for cross broswering and to run in diff envi
	public void Setup(String os,String br) throws Throwable {
		
		//loading properties file 
		FileReader file=new FileReader(".//src//test//resources//config.properties");
		p=new Properties();
		p.load(file);

		
		logger=LogManager.getLogger(this.getClass());//Log4j to generate the reports

		switch(br.toLowerCase()) {
		case "chrome" :driver=new ChromeDriver();break;
		case "edge":driver=new EdgeDriver();break;
		case "firefox":driver=new FirefoxDriver();break;
		default: System.out.println("Invalid broswer name"); return;//exit criteria if any found or not 

		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("appURL")); //using properties file
		driver.manage().window().maximize();
		}
	//to genarate random strings and password and numbers
	public String randomeString()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}

	public String randomeNumber()
	{
		String generatedString=RandomStringUtils.randomNumeric(10);
		return generatedString;
	}
	public String ZipNumber()
	{
		String generatedString=RandomStringUtils.randomNumeric(6);
		return generatedString;
	}

	public String randomAlphaNumeric()
	{
		String str=RandomStringUtils.randomAlphabetic(3);
		String num=RandomStringUtils.randomNumeric(3);
		
		return (str+"@"+num);
	}


	@AfterClass
	void tearDown() {
		driver.quit();
	}
}
