package Pages.wallet;

import Pages.BasePage;
import driverManager.DriverManager;
import handleEvents.Events;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static java.lang.Thread.sleep;

public class CrearCuenta extends BasePage {

    @FindBy(xpath = "//*[@id=\"nombreCrearCuenta\"]")
    private WebElement nombreTextField;

    @FindBy(xpath = "//*[@id=\"crearCuenta\"]")
    private WebElement crearCuentaBoton;

    private CrearCuenta insertName (String nombre) {

        Events.fillTextField(nombreTextField, nombre);
        nombreTextField = DriverManager.getInstance().esperar(By.xpath("//*[@id=\"nombreCrearCuenta\"]"));
        return this;

    }

    private void addAccount() {
        crearCuentaBoton = DriverManager.getInstance().esperar(By.xpath("//*[@id=\"crearCuenta\"]"));
        Events.click(crearCuentaBoton);
    }

    public void insertNameAndAddAccount (String name) {
        insertName(name).addAccount();
    }
}
