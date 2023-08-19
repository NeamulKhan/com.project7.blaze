package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass_Project7 {
	
	
	public static Properties project7_prop;
	public static WebDriver driver;
	
public BaseClass_Project7() {
	
try {
	FileInputStream	files = new FileInputStream( System.getProperty("user.dir")+"\\src\\test\\java\\com\\project7\\blaze\\config\\com.project7.blaze.Properties");
	
	project7_prop = new Properties();
	
	project7_prop.load(files);
	
} catch (FileNotFoundException e) {
	
	System.out.println("Please check your constructor");
	e.printStackTrace();
}catch (IOException e) {
	e.printStackTrace();
}
}

public void project7browserinit() {
	
	String project7Browser=project7_prop.getProperty("Browser1");
	
	if(project7Browser.equalsIgnoreCase("Chrome")) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\webDriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestData_Project7.implicitywait));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestData_Project7.pageLoadwait));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		}
	else if(project7Browser.equalsIgnoreCase("FireFox")) {
		
		
	}
}
 public static void launchURL(String URL) {
	 
	 driver.get(project7_prop.getProperty("URL"));
 }

}





