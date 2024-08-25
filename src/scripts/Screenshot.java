package scripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void Screenshot(WebDriver driver) throws IOException   {
	TakesScreenshot sc = (TakesScreenshot) driver;
	File src = sc.getScreenshotAs(OutputType.FILE);
    File dst = new File("./screenshot/ .jpeg");
    FileHandler.copy(src, dst);
}
}


	


