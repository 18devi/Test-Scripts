package scripts;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		Dimension d = new Dimension(400,100 );
     System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
     WebDriver driver=new FirefoxDriver();
     driver.get("https://www.instagram.com/");
	}

}
