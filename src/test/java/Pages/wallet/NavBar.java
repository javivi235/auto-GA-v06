package Pages.wallet;

import Pages.BasePage;
import driverManager.DriverManager;
import handleEvents.Events;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavBar extends BasePage {

    @FindBy(xpath = "//*[@id=\"crearCuentaNav\"]")
    private WebElement crearCuentaNav;

    public void createAccount () {
        crearCuentaNav = DriverManager.getInstance().esperar(By.xpath("//*[@id=\"crearCuentaNav\"]"));
        Events.click(crearCuentaNav);
    }

}
