package org.example.util;

import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Logger;

public class ConfigLoader {

    private static final Logger logger = Logger.getLogger(ConfigLoader.class.getName());
    private static final Properties properties = new Properties();

    static {
    try(InputStream input = ConfigLoader.class.getClassLoader().getResourceAsStream("config.properties")){
        if (input == null) {
            logger.severe("Sorry, unable to find config.properties");
        } else {
            properties.load(input);
        }
    }
    catch (Exception e){
        logger.severe("Error loading config.properties: " + e.getMessage());
    }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
