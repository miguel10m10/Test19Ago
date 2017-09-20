package src.com.baufest.core.ReadFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

/**
 * Read XML File
 * @author Miguel D'Alessio
 * */
public class GetXMLfile {

    /**
     * Read XML Config Properties
     * @author Miguel D'Alessio
     * */
    public String GetConfigProperties(String propertyConf) throws IOException{

        String property = null;
        java.util.Properties prop = new Properties();

        prop.loadFromXML(new FileInputStream(System.getProperty("user.dir")+"/baufest-testing-sade/conf/config-properties.xml"));
        property = prop.getProperty(propertyConf);

        return property;
    }
    /**
     * Read XML Messages Properties
     * @author Miguel D'Alessio
     * */
    public String GetMessageProperties(String propertyMessage) throws InvalidPropertiesFormatException,
            FileNotFoundException, IOException{

        String property = null;
        java.util.Properties prop = new Properties();

        String Leng = GetConfigProperties("language.properties");

        if(Leng.equals("ES"))
        {
            prop.loadFromXML(new FileInputStream(System.getProperty("user.dir")+"/baufest-testing-sade/conf/messages-ES-properties.xml"));
            property = prop.getProperty(propertyMessage);
        }else{
            prop.loadFromXML(new FileInputStream(System.getProperty("user.dir")+"/baufest-testing-sade/conf/messages-EN-properties.xml"));
            property = prop.getProperty(propertyMessage);
        }
        return property;
    }

    /**
     * Read XML Data Properties
     * @author Miguel D'Alessio
     * */
    public String GetDataProperties(String propertyMes) throws InvalidPropertiesFormatException,
            FileNotFoundException, IOException{

        String property = null;
        java.util.Properties prop = new Properties();

        prop.loadFromXML(new FileInputStream(System.getProperty("user.dir")+"/baufest-testing-sade/conf/data-properties.xml"));
        property = prop.getProperty(propertyMes);

        return property;
    }
    /**
     * Read XML locators
     * @author Miguel D'Alessio
     * */
    public String GetLocators(String propertyMes) throws InvalidPropertiesFormatException,
            FileNotFoundException, IOException{

        String property = null;
        java.util.Properties prop = new Properties();

        prop.loadFromXML(new FileInputStream(System.getProperty("user.dir")+"/baufest-testing-sade/conf/locators.xml"));
        property = prop.getProperty(propertyMes);

        return property;
    }

}