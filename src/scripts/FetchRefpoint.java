package scripts;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FetchRefpoint {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	     WebDriver driver=new FirefoxDriver();
	     driver.get("https://www.amazon.in/");
	     Thread.sleep(1000);
	     List<WebElement> links = driver.findElements(By.xpath("//a"));
	     for (WebElement link:links)
	     {
	    	 String ref_point = link.getAttribute("href");
	    	 System.out.println(ref_point);
			
		}
	}

}
