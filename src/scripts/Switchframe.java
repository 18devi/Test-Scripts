package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Switchframe {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
     WebDriver driver=new FirefoxDriver();
     driver.get("https://www.globalsqcl.com/demo-site/frames-and-window");
     Thread.sleep(1000);
     JavascriptExecutor js=(JavascriptExecutor)driver;
     js.executeScript("window.scrollBY(0,150)");
     Thread.sleep(1000);
     driver.findElement(By.id("iFrames")).click();
     Thread.sleep(1000);
     driver.switchTo().frame("globalqa");
     Thread.sleep(1000);
     driver.findElement(By.id("S")).sendKeys("Selenium");
     Thread.sleep(1000);
     driver.switchTo().defaultContent();
     Thread.sleep(1000);
     driver.close();
	}

}
