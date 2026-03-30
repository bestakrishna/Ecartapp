package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {

	//DataProvider 1
	
	@DataProvider(name="LoginData")
	public String [][] getData() throws IOException
	{
		String path=".\\testData\\OpenCart-TestCases.xlsx";//taking xl file from testData
		
		ExcelUtilities xlutil=new ExcelUtilities(path); //creating an object for XLUtility
		
		int totalrows=xlutil.getRowCount("Sheet1");	//total num of rows
		int totalcols=xlutil.getCellCount("Sheet1",1);//total no of columns sheet name and row num
				
		String logindata[][]=new String[totalrows][totalcols];//created for two dimension array which can store the data user and password
		
		for(int i=1;i<=totalrows;i++)  //1   //read the data from xl storing in two deminsional array 1st row header
		{		
			for(int j=0;j<totalcols;j++)  //0    i is rows j is col
			{
				logindata[i-1][j]= xlutil.getCellData("Sheet1",i, j);  //1,0 arry index start from 0 
			}
		}
	return logindata;//returning two dimension array
				
	}
	
	//DataProvider 2
	
	//DataProvider 3
	
	//DataProvider 4
}
