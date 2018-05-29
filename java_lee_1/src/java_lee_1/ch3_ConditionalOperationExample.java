package java_lee_1;

public class ch3_ConditionalOperationExample {

	public static void main(String[] args) {

		int score = 85;
		char grade = (score>90)? 'A' : 'B'; //true = A , false = B
		System.out.println("당신의 성적은 " + grade + "입니다." ); // 당신의 성적은 B 입니다.
		
		//score가 90보다 크면 grade에 A를 저장, 90보다 작거나 같으면 B를 저장
		//char grade = (score>90)? 'A' : ((score>80)?'B':'C');
		// 왠만하면 if~else로 쓴다.
		
	}

}
