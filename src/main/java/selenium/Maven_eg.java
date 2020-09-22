package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Maven_eg {
	@Test
	public void run() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Selenium");
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\facebook.com");
		driver.manage().window().maximize();
		//giving data to the respective fields
		driver.findElement(By.id("email")).sendKeys("shanealfin720@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Alfin@11");
		driver.findElement(By.cssSelector("#u_0_b")).click();
		//System.out.println(driver.findElement(By.cssSelector("div._4rbf.53ij")).getText());
		Thread.sleep(3000);
		driver.quit();
	}
		/*
		 * WebElement element = driver.findElement(By.linkText("Services")); Actions
		 * action = new Actions(driver); action.moveToElement(element).perform();
		 * Thread.sleep(1000); WebElement element1 =
		 * driver.findElement(By.linkText("Infrastructure Services")); Actions action1 =
		 * new Actions(driver); action1.moveToElement(element1).perform();
		 * Thread.sleep(1000); WebElement element2 =
		 * driver.findElement(By.linkText("Devops")); Actions action2 = new
		 * Actions(driver); action2.moveToElement(element2).click().perform();
		 * */
	/*
	 * @AfterTest public void exit() { WebDriver driver;  }
	 */
		 
		 
	
}
