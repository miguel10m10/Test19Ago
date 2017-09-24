package src.com.baufest.core.Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import src.com.baufest.core.Enums.WaitType;
import src.com.baufest.core.ReadFiles.GetXMLfile;
import src.com.baufest.core.ReportManager.ReportActions.Actions;
import src.com.baufest.core.ManageWait.WaitTypes;
import src.com.baufest.initialize.InitializeDriver;

/**
 * Created by miguel on 1/9/17.
 */
public class AssertionsType {

    WaitTypes wait = new WaitTypes();
    Actions actionsReport = new Actions();
    GetXMLfile getXMLfile = new GetXMLfile();
    InitializeDriver driver = new InitializeDriver();

    public void AssertValidation(By element, String text2, String typeOfAssertion) throws Exception {

        try {
            switch (typeOfAssertion) {
                case "equals":
                    wait.waitValidations(element, WaitType.VISIBILITY.element());
                    String textPage = driver.getDriver().findElement(element).getText();
                    Assert.assertEquals(textPage, text2);
                    break;
                case "notEquals":
                    Assert.assertNotEquals("text1", "texsds");
                    break;
                case "assertTrue":
                    //Assert.assertTrue(element.isSelected());
                    break;
                case "assertFalse":
                    //Assert.assertFalse(optionalchk.isSelected());
                    break;
                default:
                    throw new Exception();
            }
        } catch (Throwable throwable) {
            //actionsReport.failWithScreenShot(getXMLfile.GetMessageProperties("testcase.fail"));
        }
    }
}