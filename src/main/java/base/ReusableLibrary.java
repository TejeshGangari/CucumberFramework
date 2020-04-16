package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ReusableLibrary {

	public WebDriver driver;
	public Properties prop;
	
	public ReusableLibrary() {
		try {
			FileInputStream fi = new FileInputStream(new File("src/test/resources/properties.properties"));
			prop.load(fi);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
