import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demowebsite 
{
public static void main(String[] args) 
{
	
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");

	driver.manage().window().maximize();
	
	//Actions action1=new Actions(driver);
	//WebElement doubleClick =driver.findElement(By.xpath("//a[@href=\"/computers\"]"));
	//action1.doubleClick(doubleClick).perform();
	
	//Actions action2 = new Actions(driver);
	//WebElement doubleclick=driver.findElement(By.xpath("//a[@href=\"/electronics\"][1]"));
	//action2.doubleClick(doubleclick).perform();
	
	
	Actions action1=new Actions(driver);
	
	action1.sendKeys(Keys.PAGE_DOWN).perform();
	
	action1.sendKeys(Keys.PAGE_DOWN).perform();
	action1.sendKeys(Keys.PAGE_DOWN).perform();
	action1.sendKeys(Keys.PAGE_UP).perform();
	action1.sendKeys(Keys.PAGE_UP).perform();
	
	
	
	
	
	
	
}



}