import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentGuru 


{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions action = new Actions(driver);
		WebElement rightClick= driver.findElement(By.xpath("//span[text()=\"right click me\"]"));
		action.contextClick(rightClick).perform();
		Thread.sleep(500);
		
		action.moveToElement(driver.findElement(By.xpath("//span[text()='right click me']"))).contextClick().build().perform();
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Cut']"))).click().build().perform();
	
		Alert alt1 = driver.switchTo().alert();
		Thread.sleep(1000);
		alt1.accept();
		
		
		action.moveToElement(driver.findElement(By.xpath("//span[text()='right click me']"))).contextClick().build().perform();
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Edit']"))).click().build().perform();
		
		Alert alt2 =driver.switchTo().alert();
		Thread.sleep(1000);

		alt2.accept();
		
		action.moveToElement(driver.findElement(By.xpath("//span[text()='right click me']"))).contextClick().build().perform();
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Copy']"))).click().build().perform();
		
		Alert alt3 = driver.switchTo().alert();
		Thread.sleep(1000);
		alt3.accept();
		
		
		
		
	
	}
		
	
}
