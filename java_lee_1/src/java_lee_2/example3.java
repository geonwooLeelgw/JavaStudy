package java_lee_2;
import java.util.*;
public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("처음값을 입력하세요: ");
		int i=sc.nextInt();
		System.out.print("끝값을 입력하세요 : ");
		int j=sc.nextInt();
		int sum=0;
		for(;i<=j;i++) {
			sum += i;
			System.out.print(i);
			if(i<j) {
				System.out.print("+");}
				else {
					System.out.print("=");
					System.out.print(sum);

			}
		} 
		sc.close();
	}//변수 이름 이쁘게하기...

}
