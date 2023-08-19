package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility_Project7 {
	
	public static void takeMyScreenshot(WebDriver driver, String screenshot) {
		File srcfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String correntdir = System.getProperty("user.dir");
		try {
		FileUtils.copyFile(srcfile, new File(correntdir+"/screenShot_Project7/"+screenshot+".png")); //copy and paste screenshot folder name
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}

		}

	



}
