//package stepdefinitions;
//
//import Pages.wallet.Home;
//import cucumber.api.PendingException;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import driverManager.DriverManager;
//import handlepages.LoadHomePage;
//import org.junit.Assert;
//
//public class WalletHomeStepDef {
//    Home home;
//    @Given("^Walle page is loaded$")
//    public void wallePageIsLoaded() {
//        home = LoadHomePage.loadWalletHome();
//    }
//
//    @And("^browser is maximazed$")
//    public void browserIsMaximazed() {
//        DriverManager.getInstance().maximizar();
//    }
//
//
//    @Then("^Search textfield with the account name$")
//    public void searchTextfieldWithTheAccountName() {
//        Assert.assertTrue(home.isNombreVisible());
//    }
//
//
//    @And("^link is redirect to: \"([^\"]*)\"$")
//    public void linkIsRedirectTo(String link) {
//        // Write code here that turns the phrase above into concrete actions
//        Assert.assertEquals(link, DriverManager.getInstance().getURL());
//    }
//
//    @And("^Verify if the account name is 'Global'$")
//    public void verifyIfTheAccountNameIsGlobal() {
//        Assert.assertEquals("Global", home.getCuentaActual());
//    }
//
//    @Then("^Search the edit name button$")
//    public void searchTheEditNameButton() {
//        Assert.assertTrue(home.isEditButtonVisible());
//    }
//
//    @And("^Verify the save button is invisible$")
//    public void verifyTheSaveButtonIsInvisible() {
//        Assert.assertFalse(home.isGuardarCuentaVisible());
//    }
//
//    @Then("^Search the Delete account button$")
//    public void searchTheDeleteAccountButton() {
//        Assert.assertTrue(home.isDeleteButtonVisible());
//    }
//
//    @Then("^Search the title$")
//    public void searchTheTitle() {
//        Assert.assertTrue(home.isCuentaTituloVisible());
//    }
//
//    @And("^Verify title says \"([^\"]*)\"$")
//    public void verifyTitleSays(String title) {
//        // Write code here that turns the phrase above into concrete actions
//        Assert.assertEquals(title, home.getTituloText());
//    }
//
//    @Then("^Search Saldocuenta$")
//    public void searchSaldocuenta() {
//        Assert.assertTrue(home.isSaldoVisible());
//    }
//
//    @And("^verify saldo says \"([^\"]*)\"$")
//    public void verifySaldoSays(String title) {
//        // Write code here that turns the phrase above into concrete actions
//        Assert.assertEquals(title, home.getSaldoText());
//    }
//
//    @Then("^Search the Ingresos table$")
//    public void searchTheIngresosTable() {
//        Assert.assertTrue(home.isTablaIngresosVisible());
//    }
//
//    @Then("^Search the Egresos table$")
//    public void searchTheEgresosTable() {
//        Assert.assertTrue(home.isTablaEgresosVisible());
//    }
//
//    @Then("^Search the category button$")
//    public void searchTheCategoryButton() {
//        Assert.assertTrue(home.isAddCategoriaButtonVisible());
//    }
//
//    @Then("^Search the report button$")
//    public void searchTheReportButton() {
//        Assert.assertTrue(home.isEditButtonVisible());
//    }
//}
