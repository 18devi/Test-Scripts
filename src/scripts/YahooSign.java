package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSign {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/?");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("devikamamadapur@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@role='checkbox']")).click();
		Thread.sleep(2000);
		


	}

}
