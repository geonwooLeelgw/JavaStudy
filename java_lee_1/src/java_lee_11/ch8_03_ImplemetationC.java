package java_lee_11;

public class ch8_03_ImplemetationC implements ch8_03_InterfaceC {

	//A,B를 상속 받았기 때문에 A,B 추상 메소드도 선언해줘야한다.
	@Override
	public void mothhodA() {
		System.out.println("ImplemetationC-methodA 실행");
		
	}

	@Override
	public void methodB() {
		System.out.println("ImplemetationC-methodB 실행");
		
	}

	@Override
	public void methodC() {
		System.out.println("ImplemetationC-methodC 실행");
		
	}
	
	
}
