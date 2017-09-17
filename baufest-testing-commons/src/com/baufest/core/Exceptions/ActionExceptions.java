package src.com.baufest.core.Exceptions;

import tests.MainTest;
import src.com.baufest.core.ReportManager.ReportActions.Actions;

public class ActionExceptions extends Exception {

    Actions actReport = new Actions();
    MainTest main = new MainTest();

    public ActionExceptions() throws Exception {
        actReport.failWithScreenShot(main.getDriver(), "Problems in the actions");
    }

}
