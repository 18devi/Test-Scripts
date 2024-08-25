package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Uploadafile {

	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      driver.get("https://demoqa.com/upload_download");
      Thread.sleep(1000);
      driver.findElement(By.id("uploadFile")).sendKeys("\"C:\\Users\\Hp\\Desktop\\checkbox.html\"");
      
	}

}
