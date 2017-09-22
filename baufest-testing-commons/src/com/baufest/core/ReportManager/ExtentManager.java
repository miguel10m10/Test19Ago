package src.com.baufest.core.ReportManager;

import com.relevantcodes.extentreports.ExtentReports;
import src.com.baufest.core.ReadFiles.GetXMLfile;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentManager{

    static GetXMLfile getXMLfile = new GetXMLfile();

    static ExtentReports extent;
    static String dateName = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date());
    static String destination = System.getProperty("user.dir") +"/test-output/report/"+dateName+".html";

    final static String filePath = destination;

    public synchronized static ExtentReports getReporter() {
        if (extent == null) {
            extent = new ExtentReports(filePath, true);
        }

        return extent;
    }
}
