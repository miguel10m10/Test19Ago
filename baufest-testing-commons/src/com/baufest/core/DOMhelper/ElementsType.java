package src.com.baufest.core.DOMhelper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import src.com.baufest.core.Enums.WaitType;
import src.com.baufest.core.ManageWait.WaitTypes;
import src.com.baufest.initialize.InitializeDriver;
import src.com.baufest.initialize.InitializeMethods;
import src.com.baufest.main.MainClass;

/**
 * Created by miguel on 1/9/17.
 */
public class ElementsType {

    WaitTypes wait = new WaitTypes();
    InitializeDriver driver = new InitializeDriver();

    /**
     * Elements Type
     *
     * @param element
     * @param elementType
     * @Exeption Exception
     */
    public void ElementsType(By element, String elementType) throws Exception {

        switch (elementType) {
            case "click":
                wait.waitValidations(element, WaitType.VISIBILITY.element());
                //wait.waitValidations(driver, element, "clickable");
                driver.getDriver().findElement(element).click();
                break;
            default:
                System.out.println("La edad no es crítica");
                break;
        }
    }
    /**
     * Elements Type
     * @param element
     * @param elementType
     * @param data
     * @Exeption Exception
     */
    public void ElementsType(By element, String elementType, String data) throws Exception {

        switch (elementType) {
            case "send_key":
                wait.waitValidations(element, WaitType.VISIBILITY.element());
                driver.getDriver().findElement(element).clear();
                driver.getDriver().findElement(element).sendKeys(data);
                break;
            default:
                throw new Exception();
        }
    }
}
