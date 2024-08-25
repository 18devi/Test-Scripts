package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleMap {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/maps");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='Directions']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='tactile-searchbox-input']/../../../../../div[1]/div[2]/div[1]/div[1]/input")).sendKeys("Marthalli");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='directions-searchbox-0']/button[1]")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='tactile-searchbox-input']/../../../../../div[2]/div[2]/div[1]/div[1]/input")).sendKeys("Rajajinagar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='directions-searchbox-1']/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Details']")).click();
		Thread.sleep(2000);
	}
}
