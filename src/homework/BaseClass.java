package homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseClass {
        public static WebDriver driver;

        public void openBrowser( String baseUrl ) {

                // String baseUrl = "https://demo.nopcommerce.com/";
                System.setProperty ("webdriver.chrome.driver", "drivers/chromedriver.exe");
                driver = new ChromeDriver ();
                driver.get (baseUrl);
                driver.manage ().window ().maximize ();
                driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (20));//we give  implicit time to load page

        }

        public void closeBrowser() {

                driver.quit ();
        }
}

