package assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) 
	{
		// Windows Handling
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alfin.anthonyraj\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='/windows']")).click();
		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
		Set<String> winds= driver.getWindowHandles();
		Iterator<String> itr= winds.iterator();
		String Parent=itr.next();
		String child=itr.next();
		System.out.println("Child Window");
		driver.switchTo().window(child);
		System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText());
		System.out.println("Switching to Parent");
		driver.switchTo().window(Parent);
		System.out.println(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());
		driver.quit();
	}

}
