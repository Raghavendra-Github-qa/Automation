package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DemoA {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//Create object of Properties class
		Properties p = new Properties();
		//Open the property file
		p.load(new FileInputStream("./config.properties"));
		//Get the value of the property and print it
		String v = p.getProperty("URL");
		System.out.println(v);
	}
}