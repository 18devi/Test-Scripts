package scripts;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class SeleniumTabChange {
       public static void main(String[] args) throws InterruptedException, AWTException{
       System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
       WebDriver driver=new FirefoxDriver();
       driver.get("https://www.selenium.dev/");
       Thread.sleep(1000);
        List<WebElement> main = driver.findElements(By.xpath("//div[@id='main_navbar']/ul/li"));
        for(int i=0;i<main.size();i++)
        {
        WebElement list=main.get(i);
        Actions act = new Actions(driver);
        act.contextClick(list).perform();
         Robot rbt = new Robot();
        rbt.keyPress(KeyEvent.VK_RIGHT);
        rbt.keyRelease(KeyEvent.VK_RIGHT);
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);
        String url = driver.getCurrentUrl();
        
        
        
	 }
       
  } 
        
}   



