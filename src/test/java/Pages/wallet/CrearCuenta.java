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

    public void insertName (String nombre) {

        nombreTextField = DriverManager.getInstance().esperar(By.xpath("//*[@id=\"nombreCrearCuenta\"]"));
        Events.fillTextField(nombreTextField, nombre);

    }

    public void addAccount() {
        crearCuentaBoton = DriverManager.getInstance().esperar(By.xpath("//*[@id=\"crearCuenta\"]"));
        Events.click(crearCuentaBoton);
    }

    public boolean isInsertNameVisible () {
        nombreTextField = DriverManager.getInstance().esperar(By.xpath("//*[@id=\"nombreCrearCuenta\"]"));
        return Events.isVisible(nombreTextField);
    }

    public boolean isAddAccountButton () {
        crearCuentaBoton = DriverManager.getInstance().esperar(By.xpath("//*[@id=\"crearCuenta\"]"));
        return Events.isVisible(crearCuentaBoton);
    }
}
