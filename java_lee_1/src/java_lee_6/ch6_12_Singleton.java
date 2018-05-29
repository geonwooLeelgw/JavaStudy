package java_lee_6;

public class ch6_12_Singleton {
	
	private static ch6_12_Singleton singleton = new ch6_12_Singleton();
	
	ch6_12_Singleton () {
		
	}
	
	static ch6_12_Singleton getInstance(){
		return singleton;
	}
}