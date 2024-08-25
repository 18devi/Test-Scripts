package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tool_TipFetch {

	public static void main(String[] args) throws InterruptedException {  
    System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
    WebDriver driver=new FirefoxDriver();
    driver.get("https://www.facebook.com/");
    Thread.sleep(2000);
    WebElement kannada = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
	String tooltip = kannada.getAttribute("title");
	String ref_point = kannada.getAttribute("href");
	System.out.println(tooltip);
	System.out.println(ref_point);
	driver.quit();
	
     
    
	}

}