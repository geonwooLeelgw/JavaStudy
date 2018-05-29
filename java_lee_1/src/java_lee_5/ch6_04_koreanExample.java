package java_lee_5;

public class ch6_04_koreanExample {

	public static void main(String[] args) {
		//본인의 이름과 주민번호 앞자리로 k1, k2객체를 각각 생성해서 필드값을 출력해보세요.
		
		ch6_04_korean k1 = new ch6_04_korean("이건우","960123");
		ch6_04_korean k2 = new ch6_04_korean("LeeGenWoo","960123");
		
		System.out.println (k1.name);
		System.out.println(k1.ssn);
		System.out.println(k2.name);
		System.out.println(k2.ssn);
	}

}
