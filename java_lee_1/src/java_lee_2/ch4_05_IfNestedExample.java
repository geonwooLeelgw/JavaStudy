package java_lee_2;
import java.util.*;
public class ch4_05_IfNestedExample {

	public static void main(String[] args) {
		//중첩 If문
		/* 점수를 입력 받고
		 * 
		 * 90점 이상인 점수에 대해 95점 이상이면 A+
		 * 90이상 95미만이면 A
		 * 85~89 B+
		 * 80~84 B
		 * 75~79 C+
		 * 70~74 D+
		 * 
		 * 
		 * if문이 끝나면 학점을 출력하는 print문 사용
		 * 주의할 점은 학점 값을 처리하는 String 타입의 변수를 하나 사용
		 */
		int score;
		String sub;
		System.out.print("점수를 입력하세요 :");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		if(score>=90) {
			sub = "A";
			if(score>=95) {
				sub = "A+";
			}
		}
		else if(score>=80) {
			if(score>=85) {
				sub = "B+";
			}
			else {			//이런식으로도 가능
				sub = "B"; 
				
			}
		}
		else if(score>=70) {
			sub = "C";
			if(score>=75) {
				sub = "C+";
			}
		}
		else if(score>=60) {
			sub = "D";
			if(score>=65) {
				sub = "D+";
			}
		}else {
			sub ="F";
		}
		System.out.println("학점 :"+sub);
		sc.close();

	}

}
