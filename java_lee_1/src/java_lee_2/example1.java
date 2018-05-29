package java_lee_2;
import java.util.*;
public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("점수, 학년을 입력하시오 : ");
		int sco = sc.nextInt();
		int level = sc.nextInt();
		
		
		if(level!=4) {
			if(sco>=60) { //4학년이 아니고 60점 이상
				System.out.println("합격입니다.");
			}
			else
				System.out.println("불합격입니다.");
		} else {
			if(sco>=70) { //4학년이고 70점이상
				System.out.println("합격입니다.");
			}else
				System.out.println("불합격입니다.");
			sc.close();
		}
		
	}

}
