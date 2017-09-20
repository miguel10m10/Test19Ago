package src.com.baufest.testcases.module_1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import src.com.baufest.functions.login.LoginFunctions;
import src.com.baufest.main.MainClass;
import src.com.baufest.core.Exceptions.ActionExceptions;

public class login extends MainClass {

    LoginFunctions login = new LoginFunctions();

    @Test(dataProvider="Login")
    public void Test1(String testCaseName, String userName, String password) throws Exception {
        try {

            actionsReport.startTest(testCaseName, testCaseName, "Login", "Miguel Dalessio", testCaseName);

            login.LoginSuccessful(userName,password);

        } catch (ActionExceptions e) {
            throw new ActionExceptions();
        }
    }
}