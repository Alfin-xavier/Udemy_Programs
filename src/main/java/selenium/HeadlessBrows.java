package selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class HeadlessBrows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		
		// headless Browser
		//FirefoxOptions options=new FirefoxOptions(); options.setHeadless(true); 
		
		//Navigation Concept
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.atmecs.com");
		System.out.println("Title:" + driver.getTitle());
		Thread.sleep(1000);
		
		// Navigations
		driver.navigate().to("http://facebook.com");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(500);
		driver.navigate().forward();
		driver.close();
		}

}
