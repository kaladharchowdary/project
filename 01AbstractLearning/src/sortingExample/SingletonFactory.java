package sortingExample;

import java.io.FileInputStream;
import java.util.*;
public class SingletonFactory {

	private SingletonFactory(){
	}
	static SingletonFactory sf= null;
	
	public static SingletonFactory getSingletonFactory(){
		
		if(sf==null){
			sf= new SingletonFactory();
		}
		return(sf);
	}
	
	public MainInterface getCurrentSorter(){
	Properties prop= new Properties();
	MainInterface MI=null;
	
	try{
		FileInputStream fs= new FileInputStream("src/Config.txt");
		prop.load(fs);
		String CurrentSorting = (String)prop.getProperty("CurrentSorting");
		Class c1= Class.forName(CurrentSorting);
		MI= (MainInterface)c1.newInstance();
	   
		
	}catch(Exception e){
		e.printStackTrace();
	}
	 return(MI);
	
}
}



