package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocationofWebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.Amazon.in");
		WebElement United_Kingdom = driver.findElement(By.xpath("//a[text()='United Kingdom']"));
		Point loc = United_Kingdom.getLocation();
		int y = loc.getY();
		System.out.println(y);
		int x = loc.getX();
		System.out.println(x);

	}

}
