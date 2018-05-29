package java_lee_1;

public class ch3_StringEqualsExample {

	public static void main(String[] args) {

		String strVar1 = "본인이름";
		String strVar2 = "본인이름";
		//new 연산자 : 새로운 객체를 생성할 때 사용하는 연산자
		String strVar3 = new String("본인이름");

		System.out.println(strVar1 == strVar2); //true
		System.out.println(strVar1 == strVar3); //false? 내용은 같은데 원천이 다르다.
		System.out.println();
		//.equals(내용만 같으면 true), == (원천이 다르면 false) 
		//System.out.println(strVar1 == ("본인이름"));
		System.out.println(strVar1.equals("본인이름"));
		System.out.println(strVar1.equals(strVar3));
		
	}

}
