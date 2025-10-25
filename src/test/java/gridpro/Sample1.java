package gridpro;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Sample1 {

	@Test
	public void TC01() throws MalformedURLException
	{
		URL ipaddress=new URL("");
		
		ChromeOptions option=new ChromeOptions();
		
//		DesiredCapabilities option=new DesiredCapabilities();
//		option.setBrowserName("chrome"); 
		RemoteWebDriver driver=new RemoteWebDriver(ipaddress, option);
		driver.get("https://www.google.com");
	 System.out.println(driver.getTitle());	
	
	}
}
