import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick 
{
	public static void main(String[] args) 
	  
	  {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//Actions action = new Actions(driver);
		//WebElement rightClick= driver.findElement(By.xpath("//span[text()=\"right click me\"]"));
		//action.contextClick(rightClick).perform();
		
		Actions action1=new Actions(driver);
		WebElement doubleClick =driver.findElement(By.xpath("//button [text()=\"Double-Click Me To See Alert\"]"));
		
		action1.doubleClick(doubleClick).perform();
		Alert alt=driver.switchTo().alert();
		alt.accept();
		
		
		
		
	  }
}
