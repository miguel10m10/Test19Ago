package src.com.baufest.initialize;

import src.com.baufest.core.Assertions.AssertionsType;
import src.com.baufest.core.DOMhelper.ElementsType;
import src.com.baufest.core.FileParser.PropertyParser;
import src.com.baufest.core.Random.GetRandom;
import src.com.baufest.core.ReadFiles.GetExcelFile;
import src.com.baufest.core.ReadFiles.GetXMLfile;
import src.com.baufest.core.ReportManager.ReportActions.Actions;

/**
 * Created by miguel on 17/9/17.
 */
public class InitializeMethods {

    protected GetRandom getRandom = new GetRandom();
    protected InitializeDriver initializeDriver = new InitializeDriver();
    protected AssertionsType assertionsType = new AssertionsType();
    protected ElementsType elements = new ElementsType();
    protected GetExcelFile getData = new GetExcelFile();
    protected Actions actionsReport = new Actions();
    protected GetXMLfile config = new GetXMLfile();
    protected PropertyParser parser;

}
