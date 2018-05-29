package java_lee_1;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*실수형 변수를 선언하는 타입 double(8 byte), float(4 byte)*/
		/*자바는 기본 실수값을 double 타입으로 인지하기 때문에 float 타입의 변수에 실수를 담기 위해선
		    값의 끝에 F를 붙여야 함.*/
		
		double var1 = 3.14;
		//int var2 = 3.14; => 정수형이 아니기 때문에 안됌
		float var3 = 3.14f; // 뒤에 F, f를 붙여준다.
		
		double var7 = 3e6; // 3x10^6
		float var8 = 3e6F;
		double var9 = 2e-3; // 2x10^-3
		
		System.out.println("var 1 : " +var1);
		System.out.println("var 3 : " +var3);
		System.out.println("var 7 : " +var7);
		System.out.println("var 8 : " +var8);
		System.out.println("var 9 : " +var9);
	}

}
