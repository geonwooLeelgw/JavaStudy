package java_lee_4;
import java.util.*;
public class ch5_16_Example09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select; //선택변수
		int std=0; //배열 초기값
		int[] student = new int[std]; //학생배열
		int max=0;//최대값
		int sum=0;//합계
		
		
		do {
			System.out.println("-----------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3.점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택> ");
			select = sc.nextInt();
			if(select == 1) {
				System.out.print("학생수> ");
				std = sc.nextInt();//학생 배열 수 입력
				student = new int[std];
			}
			if(select == 2) {
				for(int i=0;i<student.length;i++) {
					System.out.print((i+1)+"번 째 학생 점수 : ");
					student[i] = sc.nextInt();
				}
			}
			if(select == 3) {
				for(int k=0;k<student.length;k++) {
				System.out.println((k+1)+"번 째 학생 점수 : "+student[k]);	
				}
			}
			if(select == 4) {
				for(int j=1;j<student.length;j++) {
					if(max<student[j]) {
						max = student[j];	
					}
				}
				for(int m=0;m<student.length;m++) {
					sum += student[m];	
					}
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + (double)sum/std);
			}
			
			
		}
		while(!(select==5));{
			System.out.println("종료되었습니다.");
		}
	}

}
