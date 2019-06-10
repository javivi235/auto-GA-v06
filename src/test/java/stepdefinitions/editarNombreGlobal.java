package stepdefinitions;

import Pages.wallet.Home;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import driverManager.DriverManager;
import handlepages.LoadHomePage;
import org.junit.Assert;

public class editarNombreGlobal {
    Home home;
    @Given("^Walle page is loaded$")
    public void wallePageIsLoaded() {
        home = LoadHomePage.loadWalletHome();
    }

    @And("^browser is maximazed$")
    public void browserIsMaximazed() {
        DriverManager.getInstance().maximizar();
    }


    @Then("^Search textfield with the account name$")
    public void searchTextfieldWithTheAccountName() {
        Assert.assertTrue(home.isNombreVisible());
    }


    @And("^link is redirect to: \"([^\"]*)\"$")
    public void linkIsRedirectTo(String link) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(link, DriverManager.getInstance().getURL());
    }

    @And("^Verify if the account name is 'Global'$")
    public void verifyIfTheAccountNameIsGlobal() {
        Assert.assertEquals("Global", home.getCuentaActual());
    }

    @Then("^Search the edit name button$")
    public void searchTheEditNameButton() {
        Assert.assertTrue(home.isEditButtonVisible());
    }
    @And("^click edit button$")
    public void clickEditButton() {
        home.clickEditButton();
    }

    @Then("^write the name 'Comida'$")
    public void writeTheNameComida() {
        home.setNombreCuenta("Comida");
    }

    @Then("^Search the save name button$")
    public void searchTheSaveNameButton() {
        home.isGuardarCuentaVisible();
    }

    @And("^click save button$")
    public void clickSaveButton() {
        home.clickSaveButton();
    }

    @Then("^search alerta superior$")
    public void searchAlertaSuperior() {
        Assert.assertTrue(home.isAlertaSuperiorVisible());
    }
}
