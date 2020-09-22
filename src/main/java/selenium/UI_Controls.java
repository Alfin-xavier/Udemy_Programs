package selenium;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class UI_Controls {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		/*
		 * //selecting trip - Radio button WebElement
		 * checkbox=driver.findElement(By.xpath(
		 * "//input[@id='ctl00_mainContent_rbtnl_Trip_1']")); WebDriverWait wait=new
		 * WebDriverWait(driver,10);
		 * wait.until(ExpectedConditions.elementToBeClickable(checkbox));
		 * checkbox.click(); Thread.sleep(1000);
		 */
				
		//dynamic dropdown
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@value='HYD']")).click();
		Thread.sleep(1000);
		
		// find by using index ("//*[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA'][2]")
		//instead of using index we can use like this
		driver.findElement(By.xpath("//*[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		Thread.sleep(1000);
		
		//Calander
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_view_date2']")).click();
		List<WebElement> web=driver.findElements(By.className("ui-state-default"));
		int count=web.size();
		for(int i=0;i<count;i++)
		{
			String date=web.get(i).getText();
			if(date.equalsIgnoreCase("28"))
			{
				web.get(i).click();
			}
		}
		
				
		//selecting passengers- static dropdown
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		Select st=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		st.selectByValue("4");
		Thread.sleep(1000);
		Select st1=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		st1.selectByVisibleText("1");
		Thread.sleep(1000);
		

		//currency-static dropdown
		Select s = new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']")));
		Thread.sleep(1000);
		s.selectByValue("AED");
		Thread.sleep(1000);
		s.selectByVisibleText("INR");
		Thread.sleep(1000);
		
		//Checkbox
		  WebElement obj1=driver.findElement(By.cssSelector("input[id*='friendsandfamily']"));
		  if(obj1.isSelected()==false)
		  {
			  obj1.click(); 
		  }
		  Thread.sleep(1000);
		  
		//search flight
			driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();	
			driver.close();
	}

	
	}


