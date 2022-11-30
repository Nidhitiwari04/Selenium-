package Tetsing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingmultiplewindow

{
	public static void main(String[] args) {
		
	
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	driver.manage().window().maximize();
	
	driver.switchTo().frame("packageListFrame");
	driver.findElement(By.xpath("//a[@href=\"org/openqa/selenium/package-frame.html\"]")).click();
	
	
	
	driver.switchTo().parentFrame();
	driver.switchTo().frame("packageFrame");
	driver.findElement(By.xpath("//a[@target=\"classFrame\"]")).click();
	
	

}
}