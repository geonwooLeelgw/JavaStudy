package java_lee_11;

public class ch11_01_StringCharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "180531-456789";
		
		char gender = ssn.charAt(7);//7번째 인덱스값을 gender에 대입한다.
		
		switch (gender) {
		case'1':
			System.out.println("남자입니당");
			break;
		case'2':
			System.out.println("여자입니당");
		case'3':
			System.out.println("남자입니당");
			break;
		case'4':
			System.out.println("여자입니당");
			break;
		}
	}	

}
