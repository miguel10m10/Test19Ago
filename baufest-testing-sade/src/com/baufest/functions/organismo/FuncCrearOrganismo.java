package src.com.baufest.functions.organismo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import src.com.baufest.core.Enums.AssertType;
import src.com.baufest.core.Enums.ElementType;
import src.com.baufest.initialize.InitializeMethods;

/**
 * Created by miguel on 19/9/17.
 */
public class FuncCrearOrganismo extends InitializeMethods{


    public void CreateOrganismo(String OrganismoName) throws Exception {

        elements.ElementsType(By.xpath(config.GetLocators("button.create.organismo")), ElementType.CLICK.element());
        elements.ElementsType(By.xpath(config.GetLocators("organismo.name.input")), ElementType.SEND_KEY.element(), OrganismoName);
        elements.ElementsType(By.xpath(config.GetLocators("organismo.save")), ElementType.CLICK.element());
        //assertionsType.AssertValidation(driver, By.xpath(config.GetLocators("organismo.alert.save")), "¡Cambios guardados con éxito!", AssertType.ASSERT_EQUALS.element());

    }

}
