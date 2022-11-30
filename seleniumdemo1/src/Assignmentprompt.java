import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignmentprompt 
{

	public static void main(String[] args) throws InterruptedException 
	  
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		Actions action1 = new Actions(driver);
		WebElement doubleClick =driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		action1.doubleClick(doubleClick).perform();
	     Thread.sleep(1000);
	     
		
		Alert alt=driver.switchTo().alert();
		Thread.sleep(2000);
		String s= alt.getText();
		System.out.println("The text is :"+s) ;
		
		alt.accept();
		
		
		Thread.sleep(2000);
		
		doubleClick.click();
		
		
		alt.dismiss();
		
		//Actions action2 = new Actions(driver);
		//WebElement doubleClick1 =driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		//action2.doubleClick(doubleClick1).perform();
		//Alert alt1 = driver.switchTo().alert();
		//Thread.sleep(1000);
		//alt1.dismiss();
		
		
		
		
		
		
		
		
	  }	
	
}
