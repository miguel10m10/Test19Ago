package src.com.baufest.testcases.Servicio;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;
import resources.DataManager.DataResources;
import src.com.baufest.core.Random.GetRandom;
import src.com.baufest.functions.login.FuncLogin;
import src.com.baufest.functions.paginaPrincipal.FuncPaginaPrincipal;
import src.com.baufest.functions.servicio.FuncCrearServicio;
import src.com.baufest.initialize.InitializeDriver;
import src.com.baufest.main.MainClass;
import src.com.baufest.core.Exceptions.ActionExceptions;

import java.util.Random;

public class CrearServicio extends MainClass{

    FuncPaginaPrincipal homePage = new FuncPaginaPrincipal();
    FuncCrearServicio createServicio = new FuncCrearServicio();
    DataResources dataManager = new DataResources();
    GetRandom getRandom = new GetRandom();

    
    @DataProvider(name = "Organismo")
    public Object[][] loginData() {
        Object[][] arrayObject = getData.getExcelData("Organismo.xls", "Sheet1");
        return arrayObject;
    }

    @Test(dataProvider="Organismo")
    public void Test1(String testCaseName, String userName, String password, String OrgName) throws Exception {
        try {

            //actionsReport.startTest(testCaseName, testCaseName, "Login", "Miguel Dalessio", testCaseName);

            //login.LoginSuccessful(userName, password);
            homePage.OptionModuleAdministrar("Servicio");
            createServicio.CreateServicio("name",1,2);
            
        } catch (ActionExceptions e) {
            throw new ActionExceptions();
        }
    }
}
