package sortingExample;

public class SingletonFactoryClient {

	public static void main(String[] args){
		
		MainInterface MI= SingletonFactory.getSingletonFactory().getCurrentSorter();
		MI.sorting();
		
		
	}
}
