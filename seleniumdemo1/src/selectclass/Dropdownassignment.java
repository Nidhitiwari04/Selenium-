package selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownassignment 
{
  public static void main(String[] args) 
  
  {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	driver.get("https://formstone.it/components/dropdown/demo/");

	driver.manage().window().maximize();
	WebElement label =driver.findElement(By.xpath("//*[@id=\"demo_basic\"]"));
	Select s1= new Select(label);
	s1.selectByVisibleText("Two");
	
	
	WebElement label2 =driver.findElement(By.xpath("//*[@id=\"demo_multiple-dropdown\"]/div/div[1]/div/button"));
	Select s2=new Select(label2);
	s2.selectByIndex(4);
	s2.selectByValue("7");
	s2.selectByVisibleText("Four");
	
	
	WebElement cover=driver.findElement(By.xpath("//*[@id=\"demo_cover-dropdown\"]/div/div[2]/button[1]"));
	
	Select s3 = new Select(cover);
	
	s3.selectByVisibleText("Two");
	
	
	
	
	
	
	
	
}
}
