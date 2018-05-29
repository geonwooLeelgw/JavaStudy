package java_lee_5;

public class ch6_06_calculatorexample {

	public static void main(String[] args) {
		// calculator 객체 생성
		ch6_06_claculator ca = new ch6_06_claculator();
		//powerOn 메소드 호출
		ca.powerOn();
		//plus 메소드 호출(매개 값은 알아서..) 및 호출 결과 출력
		int result = ca.plus(100,200);
		System.out.println("ca.plus 호출 결과 : " +result);
		//divide 메소드 호출 및 호출 결과 출력
		ca.divide(0,0);
		System.out.println("ca.divide 호출 결과 : " +ca.divide(100,200));
		//powerOff 메소드 호출
		ca.powerOff();
	}

}