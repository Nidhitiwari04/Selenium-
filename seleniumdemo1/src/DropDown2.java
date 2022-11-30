import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 

{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Books")).click();
		
		WebElement orderby=driver.findElement(By.xpath("//select[@name=\"products-orderby\"]"));
		Select sel1= new Select(orderby);
		sel1.selectByValue("https://demowebshop.tricentis.com/books?orderby=5");
		
		WebElement pagesize=driver.findElement(By.xpath("//select[@id=\"products-pagesize\"]"));
			
		Select sel2= new Select(pagesize);
		sel2.selectByIndex(2);
		
		WebElement viewmode=driver.findElement(By.xpath("//select[@id=\"products-viewmode\"]"));
		Select sel3= new Select(viewmode);
		sel3.selectByVisibleText("List");
		//driver.quit();
		
	
	}

}
