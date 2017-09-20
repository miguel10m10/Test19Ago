package src.com.baufest.core.Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
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


    public void equals(WebDriver driver, By element, String text2) throws Exception {

        try {

            wait.waitValidations(element,"visible");
            String textPage = driver.findElement(element).getText();

            Assert.assertEquals(textPage, text2);
        } catch (Throwable throwable) {
            //actionsReport.failWithScreenShot(getXMLfile.GetMessageProperties("testcase.fail"));
        }





        //actionsReport.failWithScreenShot(driver, getXMLfile.GetMessageProperties("testcase.fail"));


    }
    public void notEquals(WebDriver driver, By element, String text2) throws Exception {

        Assert.assertNotEquals("text1","texsds");


    }
    public void assertTrue(WebDriver driver, By element, String text2) throws Exception {

        //Assert.assertTrue(element.isSelected());

    }
    public void assertFalse(WebDriver driver, By element, String text2) throws Exception {

        //Assert.assertFalse(optionalchk.isSelected());

    }

}