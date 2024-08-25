package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Absolute {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Hp/Desktop/Absolute.html");
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/div[1]/input[1]")).clear();
		driver.findElement(By.xpath("html/body/div[1]/input[2]")).clear();
		driver.findElement(By.xpath("html/body/div[2]/input[1]")).clear();
		driver.findElement(By.xpath("html/body/div[2]/input[2]")).clear();
		
	}

}
