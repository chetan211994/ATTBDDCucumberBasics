package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropReader {
	
	public String readPropData(String propToBeRead) throws IOException
	{
		Properties prop = new Properties();//Creating Object of Property class 
		System.getProperty("user.dir"); //This step will provide the path of our project in out machine.
		String pathOfConfig =System.getProperty("user.dir")+"\\src\\test\\resources\\Config.properties";
		
		FileInputStream fis = new  FileInputStream(pathOfConfig); 
		//By this step our system will understand that pathOfConfig is a path of file
		prop.load(fis);
		
		String Value = prop.getProperty(propToBeRead);
		System.out.println(Value);//to test whether browserValue is correct or not.
		return Value;
	}

	
	
	
}
