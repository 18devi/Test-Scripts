package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FBhightwidthFetch {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(2000);
		 WebElement welcome_text = driver.findElement(By.xpath("//h2[contains(text() , 'Face')]"));
		 Dimension size = welcome_text.getSize();
		 System.out.println(size);
		 int height = size.getHeight();
		 int width = size.getWidth();
		 System.out.println(height+" "+width);
		 driver.quit();
	}

}
