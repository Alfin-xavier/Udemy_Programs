package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		
		// UI elements and getting the error msg

		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input.depart_date.keyValue.span.span24.required.hasDatepicker.placeholder")).click();
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();
		Select s = new Select(driver.findElement(By.id("Adults")));
		s.selectByValue("3");
		Select s1 = new Select(driver.findElement(By.id("Childrens")));
		s1.selectByIndex(1);
		Select s2 = new Select(driver.findElement(By.xpath("//*[@id='Infants']")));
		s2.selectByVisibleText("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='MoreOptionsLink']")).click();
		Select s3 = new Select(driver.findElement(By.id("Class")));
		s3.selectByValue("First");
		driver.findElement(By.name("airline")).sendKeys("AirAsia Zest (Z2)");
		Thread.sleep(1000);
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}

}
