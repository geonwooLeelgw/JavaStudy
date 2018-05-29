package java_lee_6;

public class ch6_15_B {
	//같은 패키지에 있는 A클래스에서 선언한 생성자로 접근이 가능하지 확인
	ch6_15_A a1 = new ch6_15_A(true);
	ch6_15_A a2 = new ch6_15_A(1);
	//ch6_15_A a3 = new ch6_15_A("문자열"); -> 생성자를 private로 타입으로 선언해서 오류
}
