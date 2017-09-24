package src.com.baufest.testcases.Organismo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import resources.DataManager.DataResources;
import src.com.baufest.core.Random.GetRandom;
import src.com.baufest.functions.login.FuncLogin;
import src.com.baufest.functions.organismo.FuncCrearOrganismo;
import src.com.baufest.functions.paginaPrincipal.FuncPaginaPrincipal;
import src.com.baufest.main.MainClass;

public class CrearOrganismo extends MainClass{

    FuncLogin login = new FuncLogin();
    FuncPaginaPrincipal homePage = new FuncPaginaPrincipal();
    FuncCrearOrganismo createOrganismo = new FuncCrearOrganismo();
    DataResources dataManager = new DataResources();
    GetRandom getRandom = new GetRandom();
    
    @DataProvider(name = "Organismo")
    public Object[][] loginData() {
        Object[][] arrayObject = getData.getExcelData("Organismo.xls", "Sheet1");
        return arrayObject;
    }

    @Test(dataProvider="Organismo")
    public void Test1(String testCaseName, String userName, String password, String OrgName) throws Exception {
    //    try {

            actionsReport.startTest(testCaseName, testCaseName, "Login", "Miguel Dalessio", testCaseName);
            actionsReport.infoTest("dfdsdsf");
            actionsReport.failWithScreenShot("sc");

        //    login.LoginSuccessful(userName, password);
      /*      homePage.OptionModuleAdministrar("Organismo");
            createOrganismo.CreateOrganismo(OrgName+this.getRandom());

        } catch (ActionExceptions e) {
            throw new ActionExceptions();
        }*/

    }
}
