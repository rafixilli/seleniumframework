package Common;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;
	@BeforeSuite
	public void initialize_Driver() throws Exception {
		String ProjectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", ProjectPath + "\\Driver\\chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\rafim\\eclipse-workspace\\experiment\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		prop = new Properties();
		FileInputStream fis = new FileInputStream(ProjectPath + "\\Config\\configuration.properties");
		prop.load(fis);
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		
	}


}
