package src.com.baufest.functions.servicio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import src.com.baufest.core.Enums.ElementType;
import src.com.baufest.initialize.InitializeDriver;
import src.com.baufest.initialize.InitializeMethods;


public class FuncCrearServicio extends InitializeMethods{

    InitializeDriver driver = new InitializeDriver();


    public void CreateServicio(String ServicioName, int CantMax, int Duration) throws Exception {

        elements.ElementsType(By.xpath(config.GetLocators("button.create.servicio")), ElementType.CLICK.element());
        
        elements.ElementsType(By.xpath(config.GetLocators("servicio.name.input")), ElementType.SEND_KEY.element(), ServicioName);
        elements.ElementsType(By.xpath(config.GetLocators("servicio.cant_max.input")), ElementType.SEND_KEY.element(), "1");
        elements.ElementsType(By.xpath(config.GetLocators("servicio.duration.input")), ElementType.SEND_KEY.element(), "1");
        elements.ElementsType(By.xpath(config.GetLocators("servicio.save")), ElementType.CLICK.element());
        
        
    }

}
