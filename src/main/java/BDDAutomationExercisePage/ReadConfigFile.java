package BDDAutomationExercisePage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {
	
	public static Properties generateProp() {
		Properties prop=new Properties();
		FileInputStream fs;
		try {
			fs = new FileInputStream("config/config.properties");
			prop.load(fs);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		return prop;
	}

}
