package handlepages;

import Pages.wallet.CrearCuenta;
import Pages.wallet.Home;
import Pages.wallet.NavBar;
import driverManager.DriverManager;
import handleProperties.PropertyAccesor;

public class LoadHomePage {

    public static Home loadWalletHome () {

        DriverManager.getInstance().getWebDriver().navigate().to(PropertyAccesor.getInstance().getBaseUrl());

        Home home = new Home();

        return home;

    }

    public static NavBar loadNavBar () {

        NavBar nav = new NavBar();
        return nav;

    }

    public static CrearCuenta loadCrearCuenta () {

        CrearCuenta crearCuenta = new CrearCuenta();
        return crearCuenta;

    }

    public static void crearCuentaProcess () {

        Home home = loadWalletHome();
        NavBar nav = loadNavBar();
        nav.createAccount();

        CrearCuenta ca = loadCrearCuenta();
       // ca.insertNameAndAddAccount(PropertyAccesor.getInstance().getNewAccount());
        DriverManager.getInstance().salir();

    }

    public static void main(String[] args) {

        crearCuentaProcess();

    }
}
