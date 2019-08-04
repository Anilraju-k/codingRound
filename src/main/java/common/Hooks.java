package common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.sun.javafx.PlatformUtil;

public class Hooks {
	
	Properties prop;	
	 protected WebDriver driver;
	
	@BeforeSuite
	public void intiDriver() throws FileNotFoundException, IOException {
		prop=new Properties();
		prop.load(new FileInputStream(System.getProperty("user.dir")+"//src//main//config.properties"));		
		String browser=prop.getProperty("browser");
		
		/*ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("test-type");
		options.addArguments("enable-strict-powerful-feature-restrictions");
		options.addArguments("disable-geolocation");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);*/
		
		if (browser.toUpperCase().contains("CHROME")) {
		 if (PlatformUtil.isWindows()) { 
			 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        }
        if (PlatformUtil.isMac()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver");
        }       
        if (PlatformUtil.isLinux()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver_linux");
        }
        driver=new ChromeDriver();
        
		}
		
		else {
			 // need to set driver path and intialise as like chrome
			 driver=new FirefoxDriver();
		}
        
		driver.manage().window().maximize();
	}
	
	@BeforeTest
	public void loadWebPage() {		
		driver.get(prop.getProperty("applicationUrl"));
	}
	
	@AfterTest
	public void quiteBrowser() {
		  //close the browser
	    driver.quit();
	}
	
	
}
