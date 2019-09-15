package Maven.Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicTest 
{
	@Test
	public void Test1()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.home")+"/MavenProject/JavaProject/Drivers/chromedriver");
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.close();
	}

}
