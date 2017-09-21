package src.com.baufest.functions.paginaPrincipal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import src.com.baufest.core.Enums.AssertType;
import src.com.baufest.core.Enums.ElementType;
import src.com.baufest.initialize.InitializeMethods;

/**
 * Created by miguel on 19/9/17.
 */
public class PaginaPrincipal extends InitializeMethods{


    public void OptionModuleAdministrar(WebDriver driver, String option) throws Exception {

        elements.ElementsType(driver, By.xpath(config.GetLocators("button.administrar")), ElementType.CLICK.element());
        elements.ElementsType(driver, By.xpath(config.GetLocators("button.organismo")), ElementType.CLICK.element());
        assertionsType.AssertValidation(driver, By.xpath(config.GetLocators("text.organismos")), "Organismos", AssertType.ASSERT_EQUALS.element());


        //actionsReport.infoTest(config.GetMessageProperties("login.validation"));

    }

}
