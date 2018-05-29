package java_lee_1;

public class ch3_StringconcatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String 문자열을 저장할 수 있는 타입
		String str ="스트링변수 저장 및 선언";
		String str1 ="JDK" + 8.0; //JDK8.0
		String str2 = str1 + "특징"; //JDK8.0특징
		System.out.println(str2);

	
		String str3 = "JDK" + 3 + 3.0; //연결기능
		String str4 = 3 + 3.0 + "JDK"; // 앞 연산기능 뒤 연결

		System.out.println(str3);
		System.out.println(str4);

	}

}
