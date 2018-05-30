package java_lee_10;

public class ch8_01_RemoteControllerExample {

	public static void main(String[] args) {
		//인터페이스는 객체로 만들수는 없음.
		// 인터페이스 타입의 변수 선언
		ch8_01_RemoteControl rc;
		// 각각의 객체를 인터페이스 타입 변수에 대입.
		
		//Television 객체를 rc에 대입
		//따라서 rc는 Television객체가 됨.
		rc = new ch8_01_Television();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		
		//Odio 객체를 rc에 대입
		//따라서 rc는 Odio객체가 됨.
		rc = new ch8_01_Odio();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		
		//static으로 선언된 직접 접근가능
		ch8_01_RemoteControl.chageBettery();
	}

}
