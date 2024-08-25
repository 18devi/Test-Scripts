
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class abc {

	

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
 FirefoxDriver driver = new FirefoxDriver();
          String[] urls= {
        		  "https://www.getcalley.com/",
	                "https://www.getcalley.com/calley-lifetime-offer/",
	                "https://www.getcalley.com/see-a-demo/",
	                "https://www.getcalley.com/calley-teams-features/",
	                "https://www.getcalley.com/calley-pro-features/"
          };
          try {
	            for (int i = 0; i < urls.length; i++) {
	                driver.get(urls[i]);

	                // Take screenshots at different resolutions
	                captureScreenshot(driver, "1920x1080", i + 1);
	                captureScreenshot(driver, "1366x768", i + 1);
	                captureScreenshot(driver, "1536x864", i + 1);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            // Close the browser
	            driver.quit();
	        }
	    }

	private static void captureScreenshot(WebDriver driver, String resolution, int urlNumber)  throws IOException {
		
		// TODO Auto-generated method stub
		// Split the resolution into width and height
        String[] dimensions = resolution.split("x");
        int width = Integer.parseInt(dimensions[0]);
        int height = Integer.parseInt(dimensions[1]);
	}
	
 
 
 
	}

}
