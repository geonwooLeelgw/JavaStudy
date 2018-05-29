package java_lee_2;

public class ch4_IfelseExample {

	public static void main(String[] args) {
		
		/*
		 * score 변수값을 85로 선언
		 * socre가 90이상이면 90보다 큽니다. 등급은 A입니다. 출력
		 * 90미만인 경우 90보다 작습니다. 등급은 B입니다. 출력
		 */
		int score = 85;
		
		if(score >= 90) {
			System.out.println("90보다 큽니다.");
			System.out.println("등급은 A입니다");
			
		}
		else /*if (score < 90)*/ {
			System.out.print("90보다 작습니다.");
			System.out.print("등급은 B입니다");
			
		}
		
	}	

}
