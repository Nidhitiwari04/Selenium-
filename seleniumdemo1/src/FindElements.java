import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements 

{
  public static void main(String[] args) 
  
  {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		List<WebElement> objlink= driver.findElements(By.tagName("a"));
		for(WebElement objCurrentLink: objlink)
		{
		String link= objCurrentLink.getText();
		System.out.println(link);
		}
}
}