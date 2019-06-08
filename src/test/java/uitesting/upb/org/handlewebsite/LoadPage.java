package uitesting.upb.org.handlewebsite;

import uitesting.upb.org.managefile.PropertyAccesor;
import uitesting.upb.org.managepage.Nasa.AuthenticationPage;
import uitesting.upb.org.managepage.Nasa.LeftPanel;
import uitesting.upb.org.managepage.google.home.Home;
import uitesting.upb.org.webdrivermanager.DriverManager;

/**
 * @autor Marcelo Garay
 */
public class LoadPage {
    public static Home loadGoogleHome(){
        DriverManager.getInstance().getWebDriver().navigate().to(PropertyAccesor.getInstance().getBaseURL());
        return new Home();
    }

    public static LeftPanel loadNasaApiListing () {
        DriverManager.getInstance().getWebDriver().navigate().to(PropertyAccesor.getInstance().getBaseURL());
        return new LeftPanel();
    }

    public static AuthenticationPage loadAuthenticationPage() {
        return new AuthenticationPage();
    }

    public static void main(String[] args) {
        loadNasaApiListing().clickNasaApiListingButon().clickAuthentication().clickNasaApiListingButon().clickDemoKeyRateLimitsButton();
        AuthenticationPage auth = loadAuthenticationPage();
        System.out.println("Result: \n" + auth.getHourlyAndDailyLimits());
    }
}
