package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OracleDisableClick {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		    WebDriver driver=new FirefoxDriver();  
		    driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		    Thread.sleep(5000);
		    JavascriptExecutor js=(JavascriptExecutor)driver;
		    driver.findElement(By.xpath("//a[@aria-controls='java8-windows']")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//a[text()='jdk-8u371-windows-i586.exe']")).click();
		    Thread.sleep(2000);
		    WebElement download_button = driver.findElement(By.xpath("//a[text()='Download jdk-8u371-windows-i586.exe']"));
		    js.executeScript("argument[0].click();",download_button);
	}

}
