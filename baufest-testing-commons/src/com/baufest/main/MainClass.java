package src.com.baufest.main;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterSuite;
import src.com.baufest.initialize.InitializeDriver;
import src.com.baufest.initialize.InitializeMethods;

import java.io.IOException;
import java.util.Random;

public class MainClass extends InitializeMethods {

    protected int Random;



    @BeforeMethod
    public void BeforeMethod() throws InterruptedException, IOException {

        initializeDriver.StartBrowser();
        setRandom(getRandom.randomRank(1,100000));
        //parser = new PropertyParser("ObjectRepo.properties");

    }

    @AfterMethod
    public void AfterMethod() throws InterruptedException {

        initializeDriver.EndBrowser();
    }

    @AfterSuite
    public void AfterSuite() {
        // sendEmail.sendGmailEmail();
    }
    public int getRandom() {
        return Random;
    }

    public void setRandom(int random) {
        Random = random;
    }


}