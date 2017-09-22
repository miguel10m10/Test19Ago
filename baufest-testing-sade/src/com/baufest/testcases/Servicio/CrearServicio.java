package src.com.baufest.testcases.Servicio;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import src.com.baufest.functions.organismo.CreateOrganismo;
import src.com.baufest.functions.paginaPrincipal.PaginaPrincipal;
import src.com.baufest.functions.login.Login;
import src.com.baufest.main.MainClass;
import src.com.baufest.core.Exceptions.ActionExceptions;

public class CrearServicio extends MainClass{

    Login login = new Login();
    PaginaPrincipal homePage = new PaginaPrincipal();
    CreateServicio createServicio = new CreateServicio();
    
    @DataProvider(name = "Servicio")
    public Object[][] loginData() {
        Object[][] arrayObject = getData.getExcelData("Servicio.xls", "Sheet1");
        return arrayObject;
    }

    
    public void Test1(String testCaseName, String userName, String password, String ServName, int CantMax,int Duration) throws Exception {
        try {

            //actionsReport.startTest(testCaseName, testCaseName, "Login", "Miguel Dalessio", testCaseName);

            login.LoginSuccessful(this.initializeDriver.getDriver(), userName, password);
            homePage.OptionModuleAdministrar(this.initializeDriver.getDriver(), "Servicio");
            createServicio.CreateServicio(this.initializeDriver.getDriver(), ServName+this.getRandom());
            
        } catch (ActionExceptions e) {
            throw new ActionExceptions();
        }
    }
}
