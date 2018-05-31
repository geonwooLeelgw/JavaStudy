package java_lee_11;

public class B_Bird extends  B_Countable {
	
	
	B_Bird(String name,int num){
		super(name,num);
	}
	
	public void fly() {
		System.out.println(num+"마리 "+name+"가 날아간다.");
	}

	public void count() {
		System.out.println(name+"가 " +num+"마리 있다.");
		
	}

}
