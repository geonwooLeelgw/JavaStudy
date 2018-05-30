package java_lee_10;

public class ch7_13_Dog extends ch7_13_Animal{
	public ch7_13_Dog() {
		this.kind = "포유류";
	}
	
	//부모클래스에서 정의된 추상메소드를 구체화
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}