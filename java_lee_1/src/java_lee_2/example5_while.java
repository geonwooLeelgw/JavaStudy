package java_lee_2;
import java.util.*;
public class example5_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요.");
		
		int num = sc.nextInt();
		int i=0;
		int sum = 0;
		double avg = 0;
		
		sum += num;
		
		while(num!=0) {
			num = sc.nextInt();
			sum += num;
			++i;
		
		}
		
		System.out.println(sum);
		avg=sum / i;
		
		System.out.println("수의 개수는 "+i+"개이며 평균은 "+avg+"입니다.");
		sc.close();
	}

}
