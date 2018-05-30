package java_lee_10;

public class ch7_13_Cat extends ch7_13_Animal{
	//생성자를 선언해서 부모에있는 kind필드값에 포유류를 대입
	public ch7_13_Cat() {
		this.kind = "포유류";
	}
	
	//부모클래스에서 정의된 추상메소드를 구체화
	@Override
	public void sound() {
		System.out.println("야옹야옹");
	}
}
