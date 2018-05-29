package java_lee_8;

public class ch7_04_Super extends ch7_04_Airplane {
	///1의 값을 갖는 NORMAL 상수 정의
	static final int NORMAL = 1;
	//2의 값을 갖는 SUPERSONIC 상수 정의
	static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	//fly 메소드 재정의
	@Override//어노테이션(컴파일러가 
	public void fly() {
		if(flyMode==SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}
		else {
			//부모클래스의 메소드 호출(재정의가 안된) super
			super.fly();
		}
		
	}
}
