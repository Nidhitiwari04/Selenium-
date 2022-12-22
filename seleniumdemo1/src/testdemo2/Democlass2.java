package testdemo2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataprovider.XLUtility;

public class Democlass2 
{
	WebDriver driver;
	 @BeforeClass
	 public void setup()
	 {
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				driver.manage().window().maximize();
				 
			 }
	 
	 @Test(dataProvider="registerdata")
		public void LoginTest(String fname, String lname,String eid, String pwd,String cpwd)
		{
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href=\"/register\"]")).click();
	
		WebElement radio =driver.findElement(By.xpath("//input[@id=\"gender-female\"]"));
		radio.click();
		
		WebElement name = driver.findElement(By.xpath("//input[@class=\"text-box single-line\"]"));
		name.clear();
		name.sendKeys(fname);


		WebElement lastname = driver.findElement(By.xpath("//input[@id=\"Password\"]"));
		lastname.clear();
		lastname.sendKeys(lname);
		
		WebElement txtEmail = driver.findElement(By.xpath("	//input[@id=\"Email\"]"));
		txtEmail.clear();
		txtEmail.sendKeys(eid);

		WebElement txtpwd = driver.findElement(By.xpath("//input[@name=\"Password\"]"));
		txtpwd.clear();
		txtpwd.sendKeys(pwd);
		

		WebElement firmpwd = driver.findElement(By.xpath("name=\"ConfirmPassword\""));
		firmpwd.clear();
		firmpwd.sendKeys(cpwd);
		
	driver.findElement(By.xpath("id=\"register-button\"")).click();
		
		
	}
	
	 @DataProvider(name="registerdata")
		public String [][]getData() throws IOException
		{
		String path=".\\datafiles\\Registerlog.xlsx";
		XLUtility xlutil=new XLUtility(path);

		int totalrows=xlutil.getRowCount("Sheet1");
		int totalcols=xlutil.getCellCount("Sheet1",2);

		String loginData[][]=new String[totalrows][totalcols];


		for(int i=1;i<=totalrows;i++) //1
		{
		for(int j=0;j<totalcols;j++) //0
		{
		loginData[i-1][j]=xlutil.getCellData("Sheet1", i, j);
		}

		}

		return loginData;

		}
		
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
