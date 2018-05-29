package java_lee_2;
import java.util.*;
public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("더하고 싶은  숫자를 입력하세요 : ");
		int i=sc.nextInt();
		int sum=0;
		for(int j=1;j<=i;j++) {
			sum += j;
			System.out.print(j);
			if(j<i) {
				System.out.print("+");}
				else {
					System.out.print("=");
					System.out.print(sum);

			}
		} 
		sc.close();
	}

}
