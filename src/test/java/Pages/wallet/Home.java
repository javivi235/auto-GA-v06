package Pages.wallet;

import Pages.BasePage;
import driverManager.DriverManager;
import handleEvents.Events;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends BasePage {

   @FindBy (xpath = "//*[@id=\"nombreCuenta\"]")
    private WebElement nombreCuentaField;

   @FindBy (xpath = "//*[@id=\"alertaSuperior\"]")
   private WebElement alertaSuperior;

    @FindBy (xpath = "//*[@class = \"titulo\"]")
    private WebElement cuentaTitulo;

    @FindBy (xpath = "//*[@id = \"guardarCuenta\"]")
    private  WebElement guardarCuenta;

    @FindBy (xpath = "//*[@id = \"saldoCuenta\"]")
    private WebElement saldoCuenta;

    @FindBy (xpath = "//*[@id = \"editarCuenta\"]")
    private WebElement editButton;

    @FindBy (xpath = "//*[@id = \"borrarCuenta\"]")
    private WebElement deleteButton;

    @FindBy (xpath = "//*[@id = \"listaIngresos\"]")
    private WebElement tablaIngresos;

    @FindBy (xpath = "//*[@id = \"listaEgresos\"]")
    private WebElement tablaEgresos;

    @FindBy (xpath = "//*[@id = \"herramientaCategorias\"]")
    private WebElement addCategoriaButton;

    @FindBy (xpath = "//*[@id = \"botonReporte\"]")
    private WebElement reportesButton;

    public void setNombreCuenta (String nombre) {
        Events.fillTextField(nombreCuentaField, nombre);
    }

    public boolean isNombreVisible () {

        return Events.isVisible(nombreCuentaField);

    }

    public String getCuentaActual () {

        return Events.getValue(nombreCuentaField);

    }

    public boolean isEditButtonVisible () {

        return Events.isVisible(editButton);

    }

    public boolean isDeleteButtonVisible () {

        return Events.isVisible(deleteButton);

    }

    public boolean isReportesButtonVisible () {

        return Events.isVisible(reportesButton);

    }

    public boolean isAddCategoriaButtonVisible () {

        return Events.isVisible(addCategoriaButton);

    }

    public boolean isTablaIngresosVisible () {

        return Events.isVisible(tablaIngresos);

    }

    public boolean isTablaEgresosVisible () {

        return Events.isVisible(tablaEgresos);

    }

    public boolean isCuentaTituloVisible () {

        return Events.isVisible(cuentaTitulo);

    }

    public boolean isSaldoVisible () {

        return Events.isVisible(saldoCuenta);

    }

    public boolean isGuardarCuentaVisible () {

        return Events.isVisible(guardarCuenta);

    }

    public String getTituloText () {

        return Events.getText(cuentaTitulo);

    }

    public String getSaldoText () {

        return Events.getText(saldoCuenta);

    }

    public boolean isAlertaSuperiorVisible () {

        alertaSuperior = DriverManager.getInstance().esperar(By.xpath("//*[@id=\"alertaSuperior\"]"));
        return Events.isVisible(alertaSuperior);
    }

    public void clickEditButton () {

        Events.click(editButton);

    }

    public void clickSaveButton () {

        guardarCuenta = DriverManager.getInstance().esperar(By.xpath("//*[@id = \"guardarCuenta\"]"));
        Events.click(guardarCuenta);

    }

}
