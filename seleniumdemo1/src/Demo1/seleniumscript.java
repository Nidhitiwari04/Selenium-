package Demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumscript 
{
 public static void main(String[] args) 
 
 {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getPageSource());
	//Thread.sleep(3000);
	driver.close();
	
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getPageSource());
	//Thread.sleep(3000);
	driver.close();
}
}
