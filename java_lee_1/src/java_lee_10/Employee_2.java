package java_lee_10;

public class Employee_2 {
	//필드
	String name; //protected
	double price; //protected
	
	//생성자
	public Employee_2(String name, double price){
		this.price = price;
		this.name = name;
	}
	//
	double priceUp() {
		return price = price*1.1;
		
		
		
	/*	protected : 클래스 내부, 상속
		private : 클래스 내부
		public : 모든
		default : 같은 패키지 내 모든 클래스	*/
	}
}
