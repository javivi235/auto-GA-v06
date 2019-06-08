package Pages.wallet;

import Pages.BasePage;
import driverManager.DriverManager;
import handleEvents.Events;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.function.Function;

public class Home extends BasePage {

    @FindBy (xpath = "//*[@id=\"openDrawer\"]")
    private WebElement openDrawerButton;

    public Home openDrawer () {
        Events.click(openDrawerButton);
        return this;
    }

}
