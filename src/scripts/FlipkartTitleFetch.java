package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartTitleFetch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
         WebDriver driver=new FirefoxDriver();
         driver.get("https://www.flipkart.in");
         Thread.sleep(1000);
         String title=driver.getTitle();
         System.out.println(title);
         String url=driver.getCurrentUrl();
         System.out.println(url);
         driver.quit();
         
         
	}

}
