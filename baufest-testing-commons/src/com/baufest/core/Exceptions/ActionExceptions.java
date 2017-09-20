package src.com.baufest.core.Exceptions;

import src.com.baufest.core.ReportManager.ReportActions.Actions;
import src.com.baufest.initialize.InitializeDriver;

public class ActionExceptions extends Exception {

    Actions actReport = new Actions();
    InitializeDriver ini = new InitializeDriver();

    public ActionExceptions() throws Exception {
        actReport.failWithScreenShot("Problems in the actions");
    }

}
