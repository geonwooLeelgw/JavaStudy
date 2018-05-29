package java_lee_5;
import java.util.*;
public class ch6_09_calculatorExample {

	public static void main(String[] args) {
		//main 클래스의 실행 내용
		/*
		 * 객체 생성해서
		 * 정사각형 넓이 구하는 메소드 호출하고 결과출력
		 * 직사각형 넓이 구하는 메소드 호출 후 결과출력
		 */
	
	ch6_09_calculator ca = new ch6_09_calculator();
	/*Scanner sc = new Scanner(System.in);
	double input = sc.nextDouble();*/
	ca.width = 10;
	ca.height = 10;
	double result = ca.areaRectangle(ca.width);
	double result1 = ca.areaRectangle(ca.width,ca.height);
	System.out.println("직사각형의 넓이 : "+result1);
	System.out.println("정사각형의 넓이 : "+result);
	
	}
	
}
