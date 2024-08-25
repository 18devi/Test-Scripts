package scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Googleinkannada {

	public static void main(String[] args) throws InterruptedException, AWTException {
     System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
     WebDriver driver=new FirefoxDriver();
     driver.get("https://www.google.com/");
     Thread.sleep(1000);
     WebElement kannada = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
     Thread.sleep(1000);
     Actions act=new Actions(driver);
     act.contextClick(kannada).perform();
     Robot rbt = new Robot();
     rbt.keyPress(KeyEvent.VK_RIGHT);
     rbt.keyRelease(KeyEvent.VK_RIGHT);
     rbt.keyPress(KeyEvent.VK_ENTER);
     rbt.keyPress(KeyEvent.VK_ENTER);
	}

}