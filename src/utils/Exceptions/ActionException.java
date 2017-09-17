package utils.Exceptions;

import tests.MainTest;
import utils.Report.Actions;

public class ActionException extends Exception {

    Actions actReport = new Actions();
    MainTest main = new MainTest();

    public ActionException() throws Exception {
        actReport.failWithScreenShot(main.getDriver(), "Problems in the actions");
    }

}
