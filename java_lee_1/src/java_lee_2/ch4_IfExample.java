package java_lee_2;

public class ch4_IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 93;
		
		//조건식 score가 90이상일 경우 실행
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
			
		}
		if (score <90) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다."); //중괄호를 쓰지 않으면 출력됌
		}
		
	}

}
