package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo extends DemowebShopReview {
	public static void main(String[] args) throws InterruptedException {
		login();
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Computing and Internet']/../../div[3]/div[2]/input")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Fiction']/../../div[3]/div[2]/input")).click();
        Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='removefromcart']/../../../tr[1]/td[1]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='removefromcart']/../../../tr[2]/td[1]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		Thread.sleep(2000);
		driver.quit();
		}

	
	}
	
