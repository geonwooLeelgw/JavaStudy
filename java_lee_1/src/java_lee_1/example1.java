package java_lee_1;
import java.util.*;
public class example1 {

	public static void main(String[] args) {

			
			int a,b;
			
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
			b = sc.nextInt();
			if(a>=1 & b<=10000) {
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			System.out.println(a/b);
			System.out.println(a%b);}
			else {
				System.out.print("값이 범위에 맞지 않습니다.");
			}
	}
	
}