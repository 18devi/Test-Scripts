package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text']/../../../div[1]/div/div/input")).sendKeys("Banglore");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Goa");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()=' date']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='6'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='SEARCH']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='icon icon-close']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='View Seats'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='HIDE SEATS']")).click();
		Thread.sleep(1000);
	}

}
