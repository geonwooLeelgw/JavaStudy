package java_lee_11;

public abstract class B_Countable {
	
	protected String name;
	protected int num;
	
	B_Countable(String name, int num){
		this.name = name;
		this.num = num;
	}
	
	abstract void count();
}
