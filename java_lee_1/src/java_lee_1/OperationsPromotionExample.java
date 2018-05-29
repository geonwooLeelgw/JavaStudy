package java_lee_1;

public class OperationsPromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2; => 컴파일 에러
		//byte byteValue3 = (byte) byteValue1 + byteValue2; => 하려면 이렇게 하면 됌
		// Java에서는 기본적으로 정수값으로 계산을 한다.(int)
		int intValue1 = byteValue1 + byteValue2;
		//더해서 intValue1 변수에 대입하는 거여서 형변환 할 필요없음
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		char charValue3 = (char) (charValue1 + charValue2);
		//같은 형태끼리 더했는데 Casting하는 이유는 ?...
		int intValue2 = charValue1 + charValue2;
		// 자동형변환
		System.out.println("유니코드="+ intValue2);
		System.out.println("출력문자="+ (char)intValue2);
									//강제 형변환
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0;  => 컴파일 에러 (int에다는 정수타입으로 계산)
		double doubleValue = intValue5 /4;
		// 자동형변환
		System.out.println(doubleValue);
		
	}

}
