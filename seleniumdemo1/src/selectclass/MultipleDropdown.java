package selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown 
{
  public static void main(String[] args)
  
  {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/USER/Desktop/dropdown.html");
	//https://formstone.it/components/dropdown/demo/
	driver.manage().window().maximize();
	
	WebElement multiple =driver.findElement(By.xpath("//select[@id=\"P2\"]"));
	
	Select sel1= new Select(multiple);
	sel1.selectByValue("2");
	sel1.selectByIndex(5);
	sel1.selectByVisibleText("advance");
	sel1.selectByVisibleText("python");
	sel1.selectByIndex(7);
	
	
	//sel1.deselectByValue("2");
	//sel1.deselectByIndex(5);
	//sel1.selectByVisibleText("advance");
	sel1.deselectAll();
	
	

	
	
	
}
  
  
  
  
  
  
}
