package src.com.baufest.functions.paginaPrincipal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import src.com.baufest.core.DOMhelper.SelectByDropdown;
import src.com.baufest.core.Enums.AssertType;
import src.com.baufest.core.Enums.ElementType;
import src.com.baufest.initialize.InitializeDriver;
import src.com.baufest.initialize.InitializeMethods;

/**
 * Created by miguel on 19/9/17.
 */
public class FuncPaginaPrincipal extends InitializeMethods {

    public void OptionModuleAdministrar(String option) throws Exception {

        elements.ElementsType(By.xpath(config.GetLocators("button.administrar")), ElementType.CLICK.element());
        selectByDropdown.selectByDropdownList(By.xpath(config.GetLocators("")),option);
        assertionsType.AssertValidation(By.xpath(config.GetLocators("text.organismos")), "Organismos", AssertType.ASSERT_EQUALS.element());


        //actionsReport.infoTest(config.GetMessageProperties("login.validation"));

    }

}
