package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Openbrowser {
	
	public static WebDriver driver;
	
	public static void open()
	{
	
		//System.setProperty("webdriver.chrome.driver","D:vijaylaxmi\\drivers\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://localhost:8089/OnlineHibernate/");
	}

}



