package java_lee_1;

public class ch3_LogicalOperatorExample {

	public static void main(String[] args) {

		int charCode = 'A';
		
		if ((charCode>=65) && (charCode<=90)) {
			System.out.println("대문자 이군요");
		} // 출력 o 
	
		if ((charCode>=97) && (charCode<=122)) {
			System.out.println("소문자 이군요");
		} // 출력 x
		if (!(charCode>=48) && !(charCode>57)) {
			System.out.println("0~9 숫자 이군요");
		} // 출력 x
		int value = 6;
		if ((value%2==0) || (value%3==0)) {
			System.out.println("2 또는 3의 배수 이군요");
		} // 출력 o
	
	}

}
