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
        String iType = type.toLowerCase();

        switch (iType) {
            case "info":
                log.info(message);
                break;
            case "error":
                log.error(message);
                break;
            case "fatal":
                log.fatal(message);
                break;
            case "next":
                log.info(">>>>> ---------------------------------------------------------------------------");
                break;
            default:
                log.info("Tipo de mensaje no encontrado");
                break;
        }
    }
}
