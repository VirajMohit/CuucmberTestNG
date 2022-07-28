package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	protected static ChromeDriver driver;
	protected static Properties prop;
	
	public TestBase(){ 
	}

	public static void initializeDriver() {
		prop = new Properties();
		try {
			prop.load(new FileInputStream(System.getProperty("user.dir") + 
					"//src//test//resources//ConfigFiles//config.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String strBrowser = prop.getProperty("browser");
		if (strBrowser.equalsIgnoreCase("chrome")){
			System.out.println("Chrome Browser");
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver_win32\\103\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}
	
	public static void closeBorwser() {
		driver.quit();
	}
	
}
