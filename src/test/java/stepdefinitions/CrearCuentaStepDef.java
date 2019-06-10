package stepdefinitions;

import Pages.wallet.CrearCuenta;
import Pages.wallet.Home;
import Pages.wallet.NavBar;
import cucumber.api.PendingException;
import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import driverManager.DriverManager;
import handlepages.LoadHomePage;
import org.testng.Assert;

public class CrearCuentaStepDef {

    Home home;
    NavBar navBar;
    CrearCuenta crearCuenta;

    @Given("^Walle page is loaded$")
    public void wallePageIsLoaded() {
        home = LoadHomePage.loadWalletHome();
        navBar = LoadHomePage.loadNavBar();
    }

    @And("^browser is maximazed$")
    public void browserIsMaximazed() {
        DriverManager.getInstance().maximizar();
    }

    @Then("^Search the navbar button$")
    public void searchTheNavbarButton() {

        Assert.assertTrue(navBar.isNavBarButtonVisible());

    }

    @And("^Click the nav bar button$")
    public void clickTheNavBarButton() {

        navBar.openDrawer();

    }


    @And("^link is redirect to goblal account: \"([^\"]*)\"$")
    public void linkIsRedirectToGoblalAccount(String link) {
        // Write code here that turns the phrase above into concrete actions
            Assert.assertEquals(link, DriverManager.getInstance().getURL());
        }

    @Then("^Search the add account button$")
    public void searchTheAddAccountButton() {
        Assert.assertTrue(navBar.isCreateAccountVisible());
    }

    @And("^Click the nav bar add account button$")
    public void clickTheNavBarAddAccountButton() {
        navBar.createAccount();
    }


    @Then("^link is redirect to create page: \"([^\"]*)\"$")
    public void linkIsRedirectToCreatePage(String link) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(link, DriverManager.getInstance().getURL());
        crearCuenta = new CrearCuenta();
    }

    @Then("^Search the account name field$")
    public void searchTheAccountNameField() {
        Assert.assertTrue(crearCuenta.isInsertNameVisible());
    }

    @And("^fill the account name field with \"([^\"]*)\"$")
    public void fillTheAccountNameFieldWith(String nombre){
        // Write code here that turns the phrase above into concrete actions
        crearCuenta.insertName(nombre);
    }

    @Then("^Search the add account button in the create page$")
    public void searchTheAddAccountButtonInTheCreatePage() {
        Assert.assertTrue(crearCuenta.isAddAccountButton());
    }

    @And("^click the add acount button$")
    public void clickTheAddAcountButton() {
        crearCuenta.addAccount();
    }

    @Then("^Search textfield with the account name$")
    public void searchTextfieldWithTheAccountName() {
      Assert.assertTrue(home.isNombreVisible());
    }

    @And("^Check if the account name is \"([^\"]*)\"$")
    public void checkIfTheAccountNameIs(String name) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(name, home.getCuentaActual());
    }

    @Then("^link is redirect to Comida account: \"([^\"]*)\"$")
    public void linkIsRedirectToComidaAccount(String link) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(link, DriverManager.getInstance().getURL());
    }
}

