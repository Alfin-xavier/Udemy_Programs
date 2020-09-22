package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		// getting the count of links on the page
		System.out.println(driver.findElements(By.tagName("a")).size());

		// Limiting webdrivers scope to count the links on specific area
		WebElement subdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(subdriver.findElements(By.tagName("a")).size());

		// counting links on the particular part on the area
		WebElement subdriver1 = subdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(subdriver1.findElements(By.tagName("a")).size());
		
		//check the functionality of the links
		for(int i=1;i<subdriver1.findElements(By.tagName("a")).size();i++)
		{
			String link=Keys.chord(Keys.CONTROL,Keys.ENTER);
			subdriver1.findElements(By.tagName("a")).get(i).sendKeys(link);
		}
		
		//switching taps
		Set<String> winds=driver.getWindowHandles();
		Iterator<String> itr=winds.iterator();
		//get the title of each tap
		while(itr.hasNext())
		{
			driver.switchTo().window(itr.next());
			System.out.println(driver.getTitle());
		}
		
		driver.close();
	}

}
