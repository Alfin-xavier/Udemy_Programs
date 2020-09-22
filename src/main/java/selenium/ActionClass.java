package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		/*
		 * WebDriverWait w=new WebDriverWait(driver,5);
		 * w.until(ExpectedConditions.elementToBeClickable(element));
		 */
		//driver.findElement(By.cssSelector("button._2AkmmA _29YdH8")).click();
		
		  Actions a= new Actions(driver);
		  a.moveToElement(driver.findElement(By.className("_2aUbKa"))).build().perform(); 
		  a.moveToElement(driver.findElement(By.className("_1Q5BxB"))).click().perform();
		 
	}

}
