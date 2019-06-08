package driverManager.Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox implements Browser {
    @Override
    public WebDriver initializeDriver() {
        return new FirefoxDriver();
    }
}
