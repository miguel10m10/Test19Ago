package utils.Log4j;


import org.apache.log4j.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Properties;

/**
 * Created by miguel on 7/9/17.
 */
public class exampleLog4j {

     static Logger log = Logger.getLogger(exampleLog4j.class);


    @BeforeClass
    public static void setUpBeforeClass(){

        PropertyConfigurator.configure("log4j.properties");

    }
    @AfterClass
    public static void tearDownAfterClass(){



    }
    @Test
    public void test(){

        log.info("running testSDF");
        log.info("running test");
        log.info("running tSDFDSest");
        log.info("runninDFSFDSg test");
        log.info("runninSFDg test");
        log.info("runninFDSFg test");
        log.info("runniDSFDSFng test");
        log.info("runniDSFDSFSDFDSng test");


    }





}
