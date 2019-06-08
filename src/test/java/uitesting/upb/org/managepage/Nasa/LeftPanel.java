package uitesting.upb.org.managepage.Nasa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;
import uitesting.upb.org.webdrivermanager.DriverManager;

public class LeftPanel extends BasePage {

    @FindBy (xpath = "//*[@id=\"tocify-header1\"]//*[@class=\"tocify-item\"]")
    WebElement nasaApiListingButton;

    @FindBy (xpath = "//*[@id=\"tocify-header0\"]/ul//*[@class=\"tocify-item\" and @data-unique=\"overview_authentication\"]")
    WebElement authenticationButton;

    @FindBy (xpath = "//*[@class=\"tocify\"]//*[@id=\"tocify-header2\"]//*[@data-unique=\"demo_key-rate-limits\"]")
    WebElement demoKeyRateLimitsButton;

    public LeftPanel clickNasaApiListingButon () {
        Events.click(nasaApiListingButton);
        return this;
    }

    public LeftPanel clickAuthentication () {
        Events.click(authenticationButton);
        return this;
    }

    public LeftPanel clickDemoKeyRateLimitsButton () {
        demoKeyRateLimitsButton = DriverManager.getInstance().esperar(By.xpath("//*[@class=\"tocify\"]//*[@id=\"tocify-header2\"]//*[@data-unique=\"demo_key-rate-limits\"]"));
        Events.click(demoKeyRateLimitsButton);
        return  this;
    }

}
