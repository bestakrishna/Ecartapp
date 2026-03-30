package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;//log4j
import org.apache.logging.log4j.Logger;   //log4j
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	// these files are reusability files  
public	static WebDriver driver;
public Logger logger;//this is for log4j to create reports 
public Properties p; //class 

	@BeforeClass(groups= {"Sanity","Regression","Master"})
	@Parameters({"os","browser"})//this is for cross broswering and to run in diff envi
	public void Setup(String os,String br) throws Throwable {
		
		//loading properties file 
		FileReader file=new FileReader(".//src//test//resources//config.properties");
		p=new Properties();
		p.load(file);//load the properties 

		
		logger=LogManager.getLogger(this.getClass());//Log4j to generate the reports FETCH from resource folder

		switch(br.toLowerCase()) {
		case "chrome" :driver=new ChromeDriver();break;
		case "edge":driver=new EdgeDriver();break;
		case "firefox":driver=new FirefoxDriver();break;
		default: System.out.println("Invalid broswer name"); return;//exit criteria if any found or not 

		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("appURL")); //using properties file reading url from prop
		driver.manage().window().maximize();
		}
	
	
	//to genarate random strings and password and numbers
	
	//user defined methods in java 
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
	
	
@AfterClass(groups= {"Sanity","Regression","Master"})
public void teardown() {
	driver.quit();
}

public String captureScreen(String tname) throws IOException {

	String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			
	TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
	File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
	
	String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
	File targetFile=new File(targetFilePath);
	
	sourceFile.renameTo(targetFile);
		
	return targetFilePath;

}

	
}
