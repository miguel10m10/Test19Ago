package src.com.baufest.functions.servicio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import src.com.baufest.core.Enums.AssertType;
import src.com.baufest.core.Enums.ElementType;
import src.com.baufest.initialize.InitializeMethods;


public class CreateServicio extends InitializeMethods{


    public void CreateServicio(WebDriver driver, String ServicioName, int CantMax, int Duration) throws Exception {

        elements.ElementsType(driver, By.xpath(config.GetLocators("button.create.servicio")), ElementType.CLICK.element());
        
        elements.ElementsType(driver, By.xpath(config.GetLocators("servicio.name.input")), ElementType.SEND_KEY.element(), ServicioName);
        elements.ElementsType(driver, By.xpath(config.GetLocators("servicio.cant_max.input")), ElementType.SEND_KEY.element(), CantMax);
        elements.ElementsType(driver, By.xpath(config.GetLocators("servicio.duration.input")), ElementType.SEND_KEY.element(), Duration);
        elements.ElementsType(driver, By.xpath(config.GetLocators("servicio.save")), ElementType.CLICK.element());
        
        
    }

}
