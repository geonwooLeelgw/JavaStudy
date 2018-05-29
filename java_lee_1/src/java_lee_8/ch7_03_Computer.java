package java_lee_8;
//자식 클래스
public class ch7_03_Computer extends ch7_03_Calculator {
	
	//부모클래스에 선언한 areaCircel 메소드를 재정의함.
	//굳이 @Override를 쓰지 않아도 알아서 메소드 재정의가 된 것으로 인지하지만
	//컴파일러에게 정확한 지시를 위해 사용.
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI*r*r;
	}

}
