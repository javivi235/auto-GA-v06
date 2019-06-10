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

    @FindBy (xpath = "//*[@id=\"openDrawer\"]")
    private WebElement navBarButton;

    public void createAccount () {

        Events.click(crearCuentaNav);
    }

    public boolean isCreateAccountVisible () {
        crearCuentaNav = DriverManager.getInstance().esperar(By.xpath("//*[@id=\"crearCuentaNav\"]"));
        return Events.isVisible(crearCuentaNav);
    }

    public boolean isNavBarButtonVisible () {
        navBarButton = DriverManager.getInstance().esperar(By.xpath("//*[@id=\"openDrawer\"]"));
        return Events.isVisible(navBarButton);
    }

    public void openDrawer () {

        Events.click(navBarButton);

    }

}
