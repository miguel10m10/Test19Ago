package src.com.baufest.main;

import org.testng.annotations.*;
import src.com.baufest.core.Enums.Log4jType;
import src.com.baufest.initialize.InitializeMethods;
import java.io.IOException;

public class MainClass extends InitializeMethods {

    @BeforeSuite
    public void BeforeSuite() throws IOException {
        log4jActions.Log4jActions(">>>>> | Iniciando La Suite de Pruebas...", Log4jType.INFO.element());
        log4jActions.Log4jActions(">>>>> | Naveador a Utilizar: "+ getXMLfile.GetConfigProperties("browser"), Log4jType.INFO.element());
        log4jActions.Log4jActions(">>>>> | Sistema Operativo: "+System.getProperty("os.name"), Log4jType.INFO.element());
        log4jActions.Log4jActions(""+ getXMLfile.GetConfigProperties("os"), Log4jType.NEXT.element());
        getRandom.randomRank(1,10000);
    }

    @BeforeMethod
    public void BeforeMethod() throws InterruptedException, IOException {

        initializeDriver.StartBrowser();
        log4jActions.Log4jActions("", Log4jType.NEXT.element());
        log4jActions.Log4jActions(">>>>> | Iniciando el Navegador...", Log4jType.INFO.element());

        //parser = new PropertyParser("ObjectRepo.properties");

    }

    @AfterMethod
    public void AfterMethod() throws InterruptedException, IOException {

        initializeDriver.EndBrowser();
        log4jActions.Log4jActions(">>>>> | Cerrando El Navegador : "+ getXMLfile.GetConfigProperties("browser"), Log4jType.INFO.element());
        actionsReport.endTest();
    }

    @AfterSuite
    public void AfterSuite() throws IOException {
        log4jActions.Log4jActions(">>>>> | Finalizando La Suite de Pruebas...", Log4jType.INFO.element());
        // sendEmail.sendGmailEmail();
        log4jActions.Log4jActions(""+ getXMLfile.GetConfigProperties("os"), Log4jType.NEXT.element());
    }

}