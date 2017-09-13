package utils.Log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Created by miguel on 9/9/17.
 */
public class Log4jActions {

    static Logger log = Logger.getLogger(exampleLog4j.class);

    public void Log4jActions(String message, String type){
        PropertyConfigurator.configure("log4j.properties");
        String Itype = type.toLowerCase();

        if (Itype.equals("info")){
            log.info(message);
        }else if(Itype.equals("error")){
            log.error(message);
        }else if(Itype.equals("fatal")){
            log.fatal(message);
        }else{
            log.info("Typo de mensaje no encontrado");
        }
    }
}
