package gUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties  //Utility class to read test data from different input data files
{
	String myPath;  //null
	FileInputStream myFile;
	Properties prop;
	public ReadProperties(String filePath)//Local variable
	{
		myPath = filePath;
	}
	public String readData(String mykey) //throws IOException
	{		
		try {
			myFile = new FileInputStream(myPath);
			prop = new Properties(); //News Reader
			prop.load(myFile); //News paper given to news reader
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Delivery Boy
		
		return prop.getProperty(mykey);
	}

}
