import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Monsterindia 



{
	public static void main(String[] args) 
	{
		
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		driver.get("https://www.monsterindia.com/");

		driver.manage().window().maximize();
		//Actions action1=new Actions(driver);
		//WebElement doubleClick =driver.findElement(By.xpath(""));
		
		//action1.doubleClick(doubleClick).perform();
		
		
		
		
		
		
		
		
		//Actions action2=new Actions(driver);
		//WebElement doubleClick =driver.findElement(By.xpath("//a[@href=\"/computers\"]"));
		//action1.doubleClick(doubleClick).perform();
		
		
		
		
		

		
}
}