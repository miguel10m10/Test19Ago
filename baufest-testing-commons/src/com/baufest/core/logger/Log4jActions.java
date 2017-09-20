package src.com.baufest.core.logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Created by miguel on 9/9/17.
 */
public class Log4jActions {

    static Logger log = Logger.getLogger(Log4jActions.class);

    public void Log4jActions(String message, String type){
        PropertyConfigurator.configure(System.getProperty("user.dir")+"/baufest-testing-commons/log4j.properties");
        String Itype = type.toLowerCase();

        if (Itype.equals("info")){
            log.info(message);
        }else if(Itype.equals("error")){
            log.error(message);
        }else if(Itype.equals("fatal")){
            log.fatal(message);
        }else if(Itype.equals("next")){
            log.info("");
            log.info("--------------------------------------------------------------");
        }else{
            log.info("Typo de mensaje no encontrado");
        }
    }
}
