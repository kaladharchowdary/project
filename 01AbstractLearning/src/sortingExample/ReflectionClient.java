package sortingExample;

import java.io.FileInputStream;
import java.util.Properties;

public class ReflectionClient {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		MainInterface MI= null;
		
	try{
		
		 FileInputStream fs =new FileInputStream("src/Config.txt");
		 prop.load(fs);
		 String st= (String) prop.getProperty("CurrentSorting");
		Class c1= Class.forName(st);
		MI= (MainInterface) c1.newInstance();
		MI.sorting();
		
	}catch(Exception e){
		e.printStackTrace();
	}
	
	}

}
