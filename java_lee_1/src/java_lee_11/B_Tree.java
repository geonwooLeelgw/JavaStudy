package java_lee_11;

public class B_Tree extends B_Countable{

	
	B_Tree(String name,int num){
		super(name,num);
		
	}
	
	@Override
	public void count() {
		System.out.println(name+"가 "+num+"그루 있다.");
		
	}
	
	public void ripen() {
		System.out.println(num+"그루"+name+"에 열매가 잘 익었다.");
	}

}