package java_lee_1;

public class CastingExample {

	public static void main(String[] args) {

		int intValue = 44032;
		// int타입 변수에 초기값 44032를 줌
		char charValue = (char) intValue;
		// 기존에 int타입 변수를 char타입으로 강제 타입변환(Casting)
		System.out.println(charValue);
		//charValue변수 출력
		long longValue = 500;
		intValue = (int) longValue;
		//기존에 long타입 변수를 int타입으로 강제 타입변환(Casting)
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue =(int) doubleValue;
		//기존에 int타입 변수를 double타입으로 강제 타입변환(Casting)
		System.out.print(intValue);
		
			
	}

}
