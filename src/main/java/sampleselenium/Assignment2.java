package sampleselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class Assignment2
{

	WebDriver driver;

	@BeforeTest
	public void settingAndLaunchingDriver() 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		
	}
	
	
	  @Test(priority = 1) 
	  public void signUpTest() throws InterruptedException
	  {
	  
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.findElement(By.id("signin2")).click();
		  driver.findElement(By.id("sign-username")).sendKeys("ABC");
		  driver.findElement(By.id("sign-password")).sendKeys("abc@112");
		  driver.findElement(By.xpath("//div[@id='signInModal']//div//div//div[3]//button[@class='btn btn-primary']")).click();
		  Thread.sleep(2000); 
		  driver.switchTo().alert().accept();
		  Thread.sleep(1000); 
		  
	  }
	 
	  @Test(priority = 2) 
	  public void logInTest() throws InterruptedException 
	  {
		  
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.findElement(By.id("login2")).click();
		  driver.findElement(By.id("loginusername")).sendKeys("ABC");
		  driver.findElement(By.id("loginpassword")).sendKeys("abc@112");
		  driver.findElement(By.xpath("//div[@id='logInModal']//div//div//button[@class='btn btn-primary']")).click();
		  Thread.sleep(2000);
		  
	  }
	  
	@Test(priority = 3) 
	public void selectAndAddToCartProduct() throws InterruptedException 
	{ 
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']")).click();
		  driver.findElement(By.cssSelector("a.btn.btn-success.btn-lg")).click();
		  Thread.sleep(2000); 
		  String message1=driver.switchTo().alert().getText();
		  if(message1.contains("Product added"))
			  System.out.println(message1);
		  driver.switchTo().alert().accept();
		  Thread.sleep(2000);
		  for(int i=1;i<=2;i++) 
			  driver.navigate().back(); 
		  driver.findElement(By.xpath("//div[@id='tbodyid']//div[5]//div//h4//a[@class='hrefch']")).click();
		  driver.findElement(By.cssSelector("a.btn.btn-success.btn-lg")).click();
		  Thread.sleep(2000); 
		  String message2=driver.switchTo().alert().getText();
		  if(message1.contains("Product added"))
			  System.out.println(message2);
		  driver.switchTo().alert().accept();
		  
		  // click the cart to check whether the product added or not
		  
		  driver.findElement(By.xpath("//div[@id='navbarExample']//ul//li[4]")).click(); 
		  Thread.sleep(2000);
		 }
	 
	@Test(priority=4)
	public void contactUsScript() throws InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='navbarExample']//ul//li[2]//a[@class='nav-link']")).click();
		driver.findElement(By.id("recipient-email")).sendKeys("shanealfin720@gmail.com");
		driver.findElement(By.id("recipient-name")).sendKeys("Alfin Xavier");
		driver.findElement(By.id("message-text")).sendKeys("It's a good site to practice automation");
		WebDriverWait w= new WebDriverWait(driver, 5);
		WebElement button=driver.findElement(By.xpath("//div[@id='exampleModal']//div//div//div[@class='modal-footer']//button[2]"));
		w.until(ExpectedConditions.elementToBeClickable(button));
		button.click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000); 
	}

	@AfterTest
	public void closeDriver()
	{
		driver.close();
	}
}
