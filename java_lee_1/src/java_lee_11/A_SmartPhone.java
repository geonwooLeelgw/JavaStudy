package java_lee_11;
//인터페이스를 구현한다는것은 implements해라
public class A_SmartPhone extends A_PDA implements A_MobilePhone,A_MP3{

	@Override
	public void callIn() {
		System.out.println("전화를 겁니다.");
	}

	@Override
	public void callOut() {
		System.out.println("전화를 받습니다.");
		
	}

	@Override
	public void musicOn() {
		System.out.println("음악을 켭니다.");
		
	}

	@Override
	public void musicOff() {
		System.out.println("음악을 끕니다.");
		
	}

	@Override
	public void messegeIn() {
		System.out.println("메세지를 받습니다.");
		
	}

	@Override
	public void messegeOut() {
		System.out.println("메세지를 보냅니다.");
		
	}
	
}
