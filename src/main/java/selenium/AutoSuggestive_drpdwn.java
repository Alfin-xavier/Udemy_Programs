package selenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive_drpdwn 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().alert().dismiss();
		driver.findElement(By.id("src")).click();
		driver.findElement(By.id("src")).sendKeys("Ti");
		Thread.sleep(1000);
		for(int i=1;i<=3;i++)
		{
		driver.findElement(By.id("src")).sendKeys(Keys.DOWN);
		}
		driver.findElement(By.id("src")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("dest")).sendKeys("Bank");
		Thread.sleep(1000);
		driver.findElement(By.id("dest")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("onward_cal")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("td.current.day")).click();
		driver.findElement(By.id("search_btn")).click();
		
		
}
	
}