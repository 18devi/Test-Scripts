package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YoutubeplaySong {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.youtube.com");
	Thread.sleep(1000);
	driver.findElement(By.name("search_query")).sendKeys("Belakin kavithe");
	Thread.sleep(1000);
	driver.findElement(By.id("search_icon_legacy")).click();
	driver.quit();
		
	}

}
