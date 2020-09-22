package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calander {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		//Select Source
		driver.findElement(By.id("src")).click();
		driver.findElement(By.id("src")).sendKeys("Madu");
		Thread.sleep(1000);
		driver.findElement(By.id("src")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("src")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("dest")).click();
		
		//Select Destination
		driver.findElement(By.id("dest")).sendKeys("chen");
		Thread.sleep(1000);
		driver.findElement(By.id("dest")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("dest")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("onward_cal")).click();
		
		//Select Month
		
		  while(!driver.findElement(By.cssSelector("[class='rb-monthTable.first.last'] [class='rb-monthHeader'] [class='monthTitle']")).getText().contains("Sept")) 
		  {
			  driver.findElement(By.cssSelector("[class='rb-monthTable.first.last'] td[class='next']")).click();
		  }
		 
		//Select date
		List<WebElement> web=driver.findElements(By.cssSelector("td.current.day"));
		int count=web.size();
		for(int i=0;i<count;i++)
		{
			String dates=web.get(i).getText();
			if(dates.equalsIgnoreCase("29"))
			{
				web.get(i).click();
			}
		}
		//Click search button
		driver.findElement(By.id("search_btn")).click();
		//driver.quit();
	}

}
