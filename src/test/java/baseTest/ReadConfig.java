package baseTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	Properties prop;
	
	public ReadConfig() {
		try {
            prop = new Properties();

            FileInputStream fis = new FileInputStream("./src/test/resources/config.properties");
            prop.load(fis);

        } catch (IOException e) {
            System.out.println("Config file not found: " + e.getMessage());
        } 
		
	}
	public String getUrl() {
        return prop.getProperty("url");
    }
}
