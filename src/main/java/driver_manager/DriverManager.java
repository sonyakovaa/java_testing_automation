package driver_manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    private static WebDriver driver;

    public static void setDriver() {
        driver = new ChromeDriver(WebDriverConfig.configChrome());
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            setDriver();
        }

        return driver;
    }
}
