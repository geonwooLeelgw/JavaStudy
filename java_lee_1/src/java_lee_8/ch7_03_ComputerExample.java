package java_lee_8;

public class ch7_03_ComputerExample {

	public static void main(String[] args) {
		int r=10;
		
		//부모 클래스의 메소드 호출
		ch7_03_Calculator ccl = new ch7_03_Calculator();
		System.out.println("부모클래스에 메소드 호출: "+ccl.areaCircle(r));
		
		//자식 클래스에서 재정의된 메소드 호출
		ch7_03_Computer com = new ch7_03_Computer();
		System.out.println("자식클래스에 메소드 호출: "+com.areaCircle(r));
		
	}

}
