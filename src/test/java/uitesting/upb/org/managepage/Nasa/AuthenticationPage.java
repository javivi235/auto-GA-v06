package uitesting.upb.org.managepage.Nasa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.managepage.BasePage;
import uitesting.upb.org.webdrivermanager.DriverManager;

public class AuthenticationPage extends BasePage {

    @FindBy (xpath = "//li[contains(.,'Hourly Limit: 30 requests per IP address per hour')]")
    WebElement hourlyLimitText;

    @FindBy (xpath = "//li[contains(.,'Daily Limit: 50 requests per IP address per day')]")
    WebElement dailyLimitText;

    public String getHourlyAndDailyLimits () {
        hourlyLimitText = DriverManager.getInstance().esperar(By.xpath("//li[contains(.,'Hourly Limit: 30 requests per IP address per hour')]"));
        dailyLimitText = DriverManager.getInstance().esperar(By.xpath("//li[contains(.,'Daily Limit: 50 requests per IP address per day')]"));
        String limits = hourlyLimitText.getText().concat("\n").concat(dailyLimitText.getText());
        return limits;
    }
}
