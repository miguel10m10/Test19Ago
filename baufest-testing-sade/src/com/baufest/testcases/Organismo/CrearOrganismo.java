package src.com.baufest.testcases.Organismo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import src.com.baufest.functions.organismo.CreateOrganismo;
import src.com.baufest.functions.paginaPrincipal.PaginaPrincipal;
import src.com.baufest.functions.login.Login;
import src.com.baufest.main.MainClass;
import src.com.baufest.core.Exceptions.ActionExceptions;

public class CrearOrganismo extends MainClass{

    Login login = new Login();
    PaginaPrincipal homePage = new PaginaPrincipal();
    CreateOrganismo createOrganismo = new CreateOrganismo();
    
    @DataProvider(name = "Organismo")
    public Object[][] loginData() {
        Object[][] arrayObject = getData.getExcelData("Organismo.xls", "Sheet1");
        return arrayObject;
    }

    @Test(dataProvider="Organismo")
    public void Test1(String testCaseName, String userName, String password, String OrgName) throws Exception {
        try {

            //actionsReport.startTest(testCaseName, testCaseName, "Login", "Miguel Dalessio", testCaseName);

            login.LoginSuccessful(this.initializeDriver.getDriver(), userName, password);
            homePage.OptionModuleAdministrar(this.initializeDriver.getDriver(), "Organismo");
            createOrganismo.CreateOrganismo(this.initializeDriver.getDriver(), OrgName+this.getRandom());

        } catch (ActionExceptions e) {
            throw new ActionExceptions();
        }
    }
}
