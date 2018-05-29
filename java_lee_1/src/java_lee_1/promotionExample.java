package java_lee_1;

public class promotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte byteValue = 10;
		// byte 타입의 변수를 10으로 값을 줌
		
		int intValue = byteValue;
		// 기존 byte타입의 변수가 int 타입으로 자동으로 타입변환
		
		System.out.println(intValue);
		//intValue변수를 출력한다.
		char charValue = '가';
		// char 타입의 변수를 '가'로 초기값을 줌
		intValue = charValue;
		//char타입이 int타입으로 자동타입 변환
		System.out.println("가의 유니코드="+intValue);
		
		intValue = 500;
		long longValue = intValue;
		//int타입이 long타입으로 자동타입 변환
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;
		//int타입이 double타입으로 자동타입 변환
		System.out.println(doubleValue);
	}
//이런것들이 프로모션
}
