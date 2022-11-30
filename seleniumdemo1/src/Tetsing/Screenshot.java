package Tetsing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot


{
public static void main(String[] args) throws IOException
	
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("windows.scrollby(0,700)");
		js.executeScript("window.scrollBy(0,700)");
		
						
		File ScreenshotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ScreenshotFile, new File("./screenshot/screen.png"));
	
	
	
	
	
}
	
	
}
