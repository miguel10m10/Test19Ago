package src.com.baufest.core.DOMhelper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import src.com.baufest.core.Enums.WaitType;
import src.com.baufest.core.ManageWait.WaitTypes;
import src.com.baufest.initialize.InitializeDriver;

import java.util.List;

public class SelectByDropdown {

    WaitTypes wait = new WaitTypes();
    InitializeDriver driver = new InitializeDriver();

    /**
     * Elements Type
     * @param element
     * @param list
     * @Exeption Exception
     */
    public void selectByDropdownList(By list, String element) throws Exception {

        WebElement select = driver.getDriver().findElement(list);
        List<WebElement> options = select.findElements(By.tagName("option"));

            for (WebElement option : options) {
                if (element.equals(option.getText().trim()))

                    option.click();
        }
    }
}
