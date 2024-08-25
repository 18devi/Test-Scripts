package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementsExample {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
     WebDriver driver=new FirefoxDriver();
     driver.get("https://www.amazon.in/");
     Thread.sleep(1000);
     List<WebElement> links = driver.findElements(By.xpath("//a"));
     int count = links.size();
     System.out.println(count);
     
	}

}
