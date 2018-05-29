package java_lee_2;
import java.util.*;
public class ch4_03_IfElseIfElseExample {

	public static void main(String[] args) {
		
		/*
		 * 점수를 스캔으로 입력받아서
		 * 90이상이면 점수가 90~100입니다. 등급은 A입니다.
		 * 80이상 90미만이면 점수가 80~89입니다. 등급은 B입니다.
		 * 70이상 80미만이면 점수가 70~79입니다. 등급은 C입니다.
		 * 60이상 70미만이면 점수가 60~69입니다. 등급은 D입니다.
		 * 60미만이면 점수가 60미만입니다. 재수강GoGo
		 */
		int score;
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		score = sc.nextInt();
		
		if(score>=90 && score<=100) { //(90~100)
			System.out.println("점수가 90~100입니다.");
			System.out.println("등급은 A입니다.");
		}
		else if(score>=80 && score <90) {
			System.out.println("점수가 80~89입니다.");
			System.out.println("등급은 B입니다.");
		}
		else if(score>=70 && score<80) {
			System.out.println("점수가 70~79입니다.");
			System.out.println("등급은 C입니다.");
		}
		else if(score>=60 && score<70) {
			System.out.println("점수가 60~69입니다.");
			System.out.println("등급은 D입니다.");			
		}
		else {

			System.out.println("점수가 60미만 입니다.");
			System.out.println("재수강GoGo 축하드려요^^");
			sc.close();
		}
	}	

}
