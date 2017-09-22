package src.com.baufest.core.logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import src.com.baufest.core.ReadFiles.GetXMLfile;

import java.io.IOException;

/**
 * Created by miguel on 9/9/17.
 */
public class Log4jActions {

    static Logger log = Logger.getLogger(Log4jActions.class);
    private GetXMLfile getXMLfile = new GetXMLfile();

    public void Log4jActions(String message, String type) throws IOException {
        PropertyConfigurator.configure(System.getProperty("user.dir") + getXMLfile.GetProperties("log4j.prop"));
        String Itype = type.toLowerCase();

        if (Itype.equals("info")){
            log.info(message);
        }else if(Itype.equals("error")){
            log.error(message);
        }else if(Itype.equals("fatal")){
            log.fatal(message);
        }else if(Itype.equals("next")){
            log.info("");
        }else{
            log.info("Typo de mensaje no encontrado");
        }
    }
}
