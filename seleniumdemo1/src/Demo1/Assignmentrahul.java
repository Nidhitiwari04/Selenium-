package Demo1;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignmentrahul 
{
	public static void main(String[] args) throws InterruptedException 
	  
	  {
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@value=\"radio1\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"autocomplete\"]")).sendKeys("India");
		
		WebElement web = driver.findElement(By.xpath("//select[@id=\"dropdown-class-example\"]"));
		
		Select sel = new Select(web);
		sel.selectByVisibleText("Option3");
	    driver.findElement(By.xpath(" //input[@id=\"checkBoxOption1\"]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath(" //input[@id=\"checkBoxOption2\"]")).click();
		
		
		
		Thread.sleep(2000);
		
	    String parentwindow = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[@id=\"opentab\"]")).click();
		
		Set<String> childBrowser= driver.getWindowHandles();
		for(String window:childBrowser)
		{
			driver.switchTo().window(window);
			if(driver.getTitle().contains("selenium"))
			{
				Thread.sleep(1000);
				
					
				
			}
		}
		

		driver.switchTo().window(parentwindow);
		
		driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Nidhi");
		

		 driver.findElement(By.xpath("//input[@id=\"alertbtn\"]")).click();
		 Alert ale = driver.switchTo().alert();
		 Thread.sleep(1000);
		 ale.accept();
		
		
		driver.findElement(By.xpath("//input[@id=\"confirmbtn\"]")).click();
		Alert ale1 = driver.switchTo().alert();
		Thread.sleep(500);
		ale1.dismiss();
		
		driver.findElement(By.xpath("//input[@id=\"displayed-text\"]")).sendKeys("Nidhi");
		
		driver.findElement(By.xpath("//input[@id=\"hide-textbox\"]")).click();
		Thread.sleep(1000);
		
			//Web table list element
		
		List<WebElement> td = driver.findElements(By.xpath("//table[@id=\"product\"]/tbody/tr"));

	    System.out.println(td.size());

	    for (WebElement webElement : td) 
	    {
	        String name = webElement.getText();
	        System.out.println(name);        
	        
	   }
	      JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//js.executeScript("window.scrollBy(0,500)");
	    
	  //  Thread.sleep(5000);
	    
	    
	    
		
		
	    //show hide element
	      
	      
	      WebElement txtbox=driver.findElement(By.xpath("//*[@id=\"show-textbox\"]"));
			txtbox.click();
           System.out.println(txtbox.isDisplayed());
           Thread.sleep(500);
	
  
	       WebElement hide= driver.findElement(By.xpath("//*[@id=\"hide-textbox\"]"));
	       hide.click();

	   js.executeScript("window.scrollBy(0,700)");
	   
		//mouse hover
	   Thread.sleep(3000);
	   WebElement hover= driver.findElement(By.xpath("//*[@id=\"mousehover\"]"));
	   Actions act = new Actions(driver);
	   Thread.sleep(500);
	   act.moveToElement(hover).perform();
	   Thread.sleep(3000);
	  
	   
	   //iframe
	driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
	driver.findElement(By.xpath("//a[@class=\"theme-btn register-btn\"]")).click();
		
		
		
		driver.quit();
		
	
	  }
	
	
	
}
