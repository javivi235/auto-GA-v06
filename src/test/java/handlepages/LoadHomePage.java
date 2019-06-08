package handlepages;

import Pages.wallet.CrearCuenta;
import Pages.wallet.Home;
import Pages.wallet.NavBar;
import driverManager.DriverManager;
import handleProperties.PropertyAccesor;

public class LoadHomePage {

    public static void loadWalletHome () {

        DriverManager.getInstance().getWebDriver().navigate().to(PropertyAccesor.getInstance().getBaseUrl());

        Home home = new Home();
        home.openDrawer();
        NavBar nav = new NavBar();
        nav.createAccount();

        CrearCuenta ca = new CrearCuenta();
        ca.insertNameAndAddAccount(PropertyAccesor.getInstance().getNewAccount());
    }

    public static void main(String[] args) {
        loadWalletHome();
    }
}
