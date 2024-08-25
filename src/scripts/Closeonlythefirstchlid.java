package scripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Closeonlythefirstchlid {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		   WebDriver driver=new FirefoxDriver();
		   driver.get("https://demoqa.com/browser-windows");
		   Thread.sleep(1000);
	       driver.findElement(By.id("windowButton")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.id("messageWindowButton")).click();
	       Thread.sleep(2000);
	       String pid = driver.getWindowHandle();
	       System.out.println("The parent id is:"+pid);
	       Set<String> allid = driver.getWindowHandles();
	       for( String id:allid)
	       {
	    	   driver.switchTo().window(id);
	    	   String url = driver.getCurrentUrl();
	    	   if(url.equals("https://demoqa.com/sample"))
	    	   {
	    		   driver.close();
	    	   }
	       }

	}

}
