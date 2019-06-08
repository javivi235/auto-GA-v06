package handleEvents;

import org.openqa.selenium.WebElement;

public class Events {

    public static void click (WebElement webElement) {
        webElement.click();
    }

    public static void fillTextField (WebElement webElement, String input) {
        webElement.sendKeys(input);
    }

}
