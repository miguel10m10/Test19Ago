package src.com.baufest.core.DOMhelper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import src.com.baufest.core.Enums.WaitType;
import src.com.baufest.core.ManageWait.WaitTypes;

import java.util.List;

public class SelectByDropdown {

    WaitTypes wait = new WaitTypes();

    /**
     * Elements Type
     * @param driver
     * @param element
     * @param list
     * @Exeption Exception
     */
    public void selectByDropdownList(WebDriver driver, By list, String element) throws Exception {

        WebElement select = driver.findElement(list);
        List<WebElement> options = select.findElements(By.tagName("option"));

        boolean found = false;
            for (WebElement option : options) {
                if (element.equals(option.getText().trim()))

                    option.click();
                found = true;
        }
    }
}
