package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandlingSSLCert {

	public static void main(String[] args) 
	{
		DesiredCapabilities dc=DesiredCapabilities.chrome(); 
		
		dc.acceptInsecureCerts();

		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		ChromeOptions co=new ChromeOptions();

		co.merge(dc);
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.tnpsc.gov.in/");

	}

}
