package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FBFontSizeFetch {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(2000);
		 WebElement welcome_text = driver.findElement(By.xpath("//h2[contains(text() , 'Face')]"));
		 String text = welcome_text.getText();
		 String fs = welcome_text.getCssValue("font-size");
		 String fm = welcome_text.getCssValue("font-family");
		 System.out.println(text);
		 System.out.println(fs+" "+fm);
		 driver.quit();
		 

		    
	}

}
