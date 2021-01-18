package PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver ; 
	public static Properties prob ;
	
	public static WebDriver GetDriver() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	
    	prob= new Properties();
    	FileInputStream fs = new FileInputStream("./src/test/java/PageFactory/global.properties");
    	
    	prob.load(fs);
    	
    	driver.get(prob.getProperty("url"));
    	
    	
		return driver;
		
	}

}
