package driverManager;

import driverManager.Browsers.BrowserType;
import handleProperties.PropertyAccesor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import static java.lang.Thread.sleep;

public class DriverManager {

    private WebDriver webDriver;
    private WebDriverWait wait;
    private static DriverManager driverManager = new DriverManager();

    public static DriverManager getInstance() {
        return driverManager;
    }

    private DriverManager () {
        webDriver = DriverFactory.getWebDriver(BrowserType.valueOf(PropertyAccesor.getInstance().getBrowser()));
        wait = new WebDriverWait(webDriver, 10);
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public WebElement esperar(By by) {
        WebElement webElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(by)
        );
        return webElement;
    }

}
