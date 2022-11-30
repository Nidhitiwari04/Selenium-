import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multidropdown 

{
public static void main(String[] args) 
{
	

	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	driver.manage().window().maximize();
	//driver.findElement(By.tagName("select")).click();
	
	WebElement country = driver.findElement(By.tagName("select"));
	country.click();
	Select s1 = new Select(country);
	s1.selectByVisibleText("Antarctica");
	
	
}

	
}