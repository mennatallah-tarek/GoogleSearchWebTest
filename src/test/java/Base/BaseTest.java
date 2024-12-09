package Base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;

    public void setUp(String browser) {
        driver = BrowserFactory.getDriver(browser);
    }

   public void tearDown() {
       if (driver != null) {
           driver.quit();
        }
    }
}
