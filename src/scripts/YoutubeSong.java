package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YoutubeSong {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='search_query']")).sendKeys("Belakin Kavithe");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[class='style-scope ytd-searchbox']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[class='style-scope ytd-video-renderer']")).click();
	}

}
