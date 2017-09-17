package core.FileParser;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;

/**
 * Created by miguel on 17/9/17.
 * Parse Elements from .properties
 */
public class PropertyParser {

    private PropertyParser parser;
    private FileInputStream stream;
    private String RepositoryFile;
    private Properties propertyFile = new Properties();

    public PropertyParser(String fileName) throws IOException
    {
        this.RepositoryFile = fileName;
        stream = new FileInputStream(RepositoryFile);
        propertyFile.load(stream);
    }

    public By getbjectLocator(String locatorName)
    {
        String locatorProperty = propertyFile.getProperty(locatorName);
        System.out.println(locatorProperty.toString());
        String locatorType = locatorProperty.split(":")[0];
        String locatorValue = locatorProperty.split(":")[1];
        By locator = null;

        if (locatorType.equals("Id")) {
            locator = By.id(locatorValue);

        } else if (locatorType.equals("Name")) {
            locator = By.name(locatorValue);

        } else if (locatorType.equals("CssSelector")) {
            locator = By.cssSelector(locatorValue);

        } else if (locatorType.equals("LinkText")) {
            locator = By.linkText(locatorValue);

        } else if (locatorType.equals("PartialLinkText")) {
            locator = By.partialLinkText(locatorValue);

        } else if (locatorType.equals("TagName")) {
            locator = By.tagName(locatorValue);

        } else if (locatorType.equals("Xpath")) {
            locator = By.xpath(locatorValue);

        }
        return locator;
    }
}
