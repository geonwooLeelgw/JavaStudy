package java_lee_10;

public class ch7_12_PhoneExample {

	public static void main(String[] args) {
		//자식클래스의 객체 생성
		ch7_12_SmartPhone smartphone = new ch7_12_SmartPhone("소유자");
		
		//추상클래스의 객체 생성
		//ch7_12_Phone phone = new ch7_12_Phone("소유자");
		//추상클래스는 부모클래스용
		
		smartphone.turnOn();//상속받았기 때문에 부모클래스 메소드 호출 가능
		smartphone.turnOff();
		smartphone.internetSerch();
	}

}
