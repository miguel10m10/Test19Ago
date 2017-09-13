package utils.Log4j;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Created by miguel on 8/9/17.
 */
public class mainlog4j {

    static Logger log = LogManager.getLogger(exampleLog4j.class.getName());

    public static void main(String[] args){

        PropertyConfigurator.configure("log4j.properties");

        log.info("DSDFDSF");
        log.debug("debug");
        log.error("error jeje");
        log.fatal("dfssddfsfdsdfdsfd");

    }
}
