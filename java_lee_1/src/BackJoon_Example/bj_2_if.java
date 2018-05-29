package BackJoon_Example;
import java.util.*;
public class bj_2_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if(A>B) {
			if(B>C) {
				System.out.print(B);
			}
			else if(B<C) {
				System.out.println(A);
			}
		}else if(A<B) {
			if(B>C) {
				System.out.println(B);
			}else if(B<C) {
				System.out.println(C);
			}
		}
	}

}
