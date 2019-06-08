package handleProperties;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertyAccesor {

    private static PropertyAccesor propertyAccesor;
    private Properties prop;

    private PropertyAccesor () {
        try (InputStream input = new FileInputStream("gradle.properties")) {
            prop = new Properties();
            prop.load(input);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static PropertyAccesor getInstance() {
        if(propertyAccesor == null) {
            propertyAccesor = new PropertyAccesor();
        }

        return propertyAccesor;
    }

    public String getBrowser() {
        return prop.getProperty("browser");
    }

    public String getBaseUrl () {
        return prop.getProperty("url");
    }
    public String getNewAccount () {
        return prop.getProperty("newAccount");
    }
}
