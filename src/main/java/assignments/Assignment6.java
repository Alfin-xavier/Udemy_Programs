package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		
		// Dynamically handling elements with one's output and handling alert too
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alfin.anthonyraj\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		driver.findElement(By.id("checkBoxOption1")).click();
		String label = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[1]")).getText();
		System.out.println(label);

		WebElement web = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(web);
		s.selectByVisibleText(label);
		
		driver.findElement(By.id("name")).sendKeys(label);
		driver.findElement(By.id("alertbtn")).click();
		String label1=driver.switchTo().alert().getText();
		if(label1.contains(label))
		{
			System.out.println("Alert success!!");
		}
		else
		{
			System.out.println("Something wrong..");
		}
		driver.switchTo().alert().accept();
		driver.close();
	}

}
