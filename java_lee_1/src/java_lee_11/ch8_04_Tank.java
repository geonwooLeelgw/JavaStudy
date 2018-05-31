package java_lee_11;

public class ch8_04_Tank implements ch8_04_Cannon,ch8_04_Car{

	@Override
	public void work() {
		System.out.println("탱크가 앞으로 전진합니다.");
		
	}

	@Override
	public void fire() {
		System.out.println("탱크가 대포를 발사 합니다.");
		
	}
	
}
