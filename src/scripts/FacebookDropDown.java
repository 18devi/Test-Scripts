package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropDown {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.facebook.com/r.php");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		 Thread.sleep(1000);
		 WebElement drop_down = driver.findElement(By.id("day"));
		 Select sel = new Select(drop_down);
		 sel.selectByIndex(17);
		 Thread.sleep(1000);
		 WebElement drop_down1 = driver.findElement(By.id("month"));
		 Select sel1 = new Select(drop_down1);
		 sel1.selectByVisibleText("nov");
		 Thread.sleep(1000);
		 WebElement drop_down2 = driver.findElement(By.id("year"));
		 Select sel2 = new Select(drop_down2);
		 sel2.selectByIndex(2000);
	}

}
