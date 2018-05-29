package java_lee_3;
import java.util.*;
public class ch4_21_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = (int)(Math.random()*100)+1; //1~100까지의 난수
		Scanner sc = new Scanner(System.in);
		System.out.println("1과 100사이의 값을 입력하세요.");
		int bns = sc.nextInt(); //Big and Small
		int count = 0; //시도 횟수 변수
		while(count<=100) {
		if(bns==num) {
			count++;
			System.out.println("맞췄습니다.");
			System.out.println("시도횟수는 "+count+"번 입니다.");
			break;
		}else if(bns>num) {
			count++;
			System.out.println("더 작은 수를 입력하세요.");
			System.out.println("1과 100사이의 값을 입력하세요.");
			bns = sc.nextInt();
		}else {
			count++;
			System.out.println("더 큰 수를 입력하세요.");
			System.out.println("1과 100사이의 값을 입력하세요.");
			bns = sc.nextInt();
		}
		}
		sc.close();
	}

}
