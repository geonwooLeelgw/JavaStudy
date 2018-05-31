package java_lee_11;

public class ch_11_03_StringIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String subject = "자바 프로그래밍";
		
		//indeOf()
		int 위치 = subject.indexOf("밍"); //indexOf = 시작되는 인덱스 값.
		System.out.println("위치의 값: "+ 위치);
		
		int length = subject.length();
		System.out.println("length의 값: "+length); //총 8개의 글자!
		
		//replace()
		String newStr  = subject.replace("자바", "Java");
		//자바를 Java로 바꾸는 기능
		System.out.println("newSrt :"+newStr);
		
		String ssn ="18053-3456789";
		String firstNum = ssn.substring(0, 6);//0~6번 인덱스 남겨놓기
		String secondNum = ssn.substring(7);//앞에 7개 자르기
		System.out.println(firstNum);
		System.out.println(secondNum);
		
		String str3="ABcdefgHIJKLMNOPQrstuvwxyz";
		String str3Lower = str3.toLowerCase();//전부 소문자 만들기
		String str3Upper = str3.toUpperCase();//전부 대문자 만들기
		System.out.println(str3Lower);
		System.out.println(str3Upper);
		
		//trim() : 앞뒤 공백을 없애줌
		String tel1 = "         02";
		String tel2 = "12       ";
		String tel3 = "       555       ";
		
		String tel = tel1.trim()+tel2.trim()+tel3.trim();
		System.out.println(tel);
		
		if(subject.indexOf("자바") != -1) { //-1은 입력받은 문자열에 없을때.
			System.out.println("자바완 관련된 책이군요");
		}else {
			System.out.println("자바와 관련이 없는 책이군요");
		}
		
	}

}
