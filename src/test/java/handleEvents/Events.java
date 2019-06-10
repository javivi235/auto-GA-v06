package handleEvents;

import org.openqa.selenium.WebElement;

public class Events {

    public static void click (WebElement webElement) {

        webElement.click();

    }

    public static void fillTextField (WebElement webElement, String input) {

        webElement.sendKeys(input);

    }

    public static boolean isVisible (WebElement webElement) {
        return webElement.isDisplayed();
    }

    public static String getValue(WebElement webElement) {
        return webElement.getAttribute("value");
    }

    public static String getText(WebElement webElement) {
        return webElement.getText();
    }

}
