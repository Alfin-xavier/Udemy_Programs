package assignments;



import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assingment1 {

	public static void main(String[] args) throws InterruptedException {
		
			// Checking Checkboxes

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\alfin.anthonyraj\\Downloads\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			WebElement obj=driver.findElement(By.id("checkBoxOption1"));
			System.out.println("Checkbox is checked:"+ obj.isSelected());
			Assert.assertFalse(obj.isSelected());
			obj.click();
			System.out.println("Checkbox is checked:"+ obj.isSelected());
			Thread.sleep(1000);
			Assert.assertTrue(obj.isSelected());
			obj.click();
			System.out.println("Checkbox is Unchecked:"+ obj.isSelected());
			
			System.out.println("Size of the checkboxes:"+driver.findElements(By.xpath("//input[@type='checkbox']")).size());
			
	}

}
