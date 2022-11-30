import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown 
{
 public static void main(String[] args) throws InterruptedException 
 
 {
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	   
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	  
		  Thread.sleep(5000);
		//driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("nidhi");
		//driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("dwivedi");
		//driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("dwivedi@gmail.com");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("asasa");
		
		WebElement date=driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
		
		Select sel1= new Select(date);
		sel1.selectByValue("8");
		
		WebElement month = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		Select sel2= new Select(month);	
		sel2.selectByIndex(4);
		
		WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		Select sel3 =new Select(year);
		sel3.selectByVisibleText("2002");
		
		
		
		
		//public class FindElements {

			//public static void main(String[] args) {
				// TODO Auto-generated method stub

			//	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			    // WebDriver driver = new ChromeDriver();
			     //driver.get("https://demowebshop.tricentis.com/");
			     //driver.manage().window().maximize();
			    // List<WebElement> objlink=driver.findElements(By.tagName("a"));
			     
			    // for(WebElement objCurrentLink: objlink)
			    // {
			    	//String link= objCurrentLink.getT
		
		
		
		
		
}
 

}
