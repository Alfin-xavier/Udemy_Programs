package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("create a gmail");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md']")).click();
		driver.findElement(By.className("action-button")).click();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> id = ids.iterator();
		String parent = id.next();
		String child = id.next();
		driver.switchTo().window(child);
		driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Alfin");
		driver.findElement(By.name("lastName")).sendKeys("Xavier");
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("alfinxavier5");
		driver.findElement(By.name("Passwd")).sendKeys("AlfinXavier.A");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("AlfinXavier.A");
		driver.findElement(By.id("accountDetailsNext")).click();

		// driver.quit();

	}

}
