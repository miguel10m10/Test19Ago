package src.com.baufest.main;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterSuite;
import src.com.baufest.core.FileParser.PropertyParser;
import src.com.baufest.initialize.InitializeMethods;
import java.io.IOException;

public class MainClass extends InitializeMethods{

    @DataProvider(name="Login")
    public Object[][] loginData() {
        Object[][] arrayObject = getData.getExcelData("login.xls","Hoja1");
        return arrayObject;
    }

    @BeforeMethod
    public void BeforeMethod() throws InterruptedException, IOException {

        initializeDriver.StartBrowser();
        parser = new PropertyParser("ObjectRepo.properties");
    }

    @AfterMethod
    public void AfterMethod() throws InterruptedException {

        initializeDriver.EndBrowser();
    }

    @AfterSuite
    public void AfterSuite(){
        // sendEmail.sendGmailEmail();
    }
}