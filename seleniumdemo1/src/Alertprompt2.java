import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alertprompt2 

{
  public static void main(String[] args) throws InterruptedException 
  
  {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
	
	
	Actions action1 = new Actions(driver);
	WebElement doubleClick =driver.findElement(By.xpath("//button[@id=\"alertButton\"]"));
	action1.doubleClick(doubleClick).perform();
     Thread.sleep(1000);
     
     Alert alt=driver.switchTo().alert();
     String s = alt.getText();
	System.out.println("The text is =" +s);
     
        Thread.sleep(1000);
		alt.accept();
		  Thread.sleep(1000);
		doubleClick.click();
		
	alt.dismiss();
	
	//alt.accept();
	
	
	Actions a = new Actions (driver);
	WebElement e = driver.findElement(By.xpath("//button[@id=\"timerAlertButton\"]"));
	a.doubleClick(e).perform();
	
	Alert al = driver.switchTo().alert();
	String s1 = al.getText();
	System.out.println("the txt is "+s1);
	 Thread.sleep(1000);
		
	al.accept();
	 e.click();
	
	
	al.dismiss();
	
}
  
  
  
  
}
