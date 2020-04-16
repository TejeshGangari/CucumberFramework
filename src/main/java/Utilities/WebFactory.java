package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ReusableLibrary;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebFactory extends ReusableLibrary{
	private static WebDriver driver;
	
	private WebFactory() {
		
	}
	
	public static WebDriver getDriver(String browserName) {
		if(driver!=null) {
			return driver;
		}else {
			switch(browserName) {
			case "CHROME":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			return driver;
		}
	}
}
