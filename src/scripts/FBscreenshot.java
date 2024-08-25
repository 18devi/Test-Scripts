package scripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class FBscreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
    System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
    WebDriver driver=new FirefoxDriver();
    driver.get("https://www.facebook.com/");
    Thread.sleep(1000);
    driver.findElement(By.id("email")).sendKeys("data_tata");
    Thread.sleep(1000);
    driver.findElement(By.id("pass")).sendKeys("tata_data");
    Thread.sleep(1000);
    driver.findElement(By.name("login")).click();
    Thread.sleep(1000);
    TakesScreenshot ts = (TakesScreenshot)driver;
    File src = ts.getScreenshotAs(OutputType.FILE);
    File dst = new File("./screenshot/entirepage.png");
    FileHandler.copy(src, dst);
    driver.quit();
	}

}
