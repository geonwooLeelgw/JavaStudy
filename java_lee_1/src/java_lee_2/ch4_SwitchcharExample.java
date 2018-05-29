package java_lee_2;

public class ch4_SwitchcharExample {

	public static void main(String[] args) {
		
		char grade = 'B';
		/*String postion ="과장";
		 * 이런식으로도 가능
		 */
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
		case 'B': //이것도 되고
		case 'b': //이것도 되고 2가지 경우!
			System.out.println("일반 회원입니다.");
			break;
			default:
				System.out.println("손님 입니다.");
		}
	}

}
