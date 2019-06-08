package driverManager;

import driverManager.Browsers.Browser;
import driverManager.Browsers.BrowserType;
import driverManager.Browsers.Chrome;
import driverManager.Browsers.FireFox;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;

public class DriverFactory {
    public static WebDriver getWebDriver(BrowserType browserType) {

        HashMap<BrowserType, Browser> browserPickUp = new HashMap<>();
        browserPickUp.put(BrowserType.CHROME, new Chrome());
        browserPickUp.put(BrowserType.FIREFOX, new FireFox());

        return browserPickUp.get(browserType).initializeDriver();

    }
}
