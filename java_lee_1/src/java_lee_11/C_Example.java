package java_lee_11;
import java.util.*;
public class C_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new  Scanner(System.in);
		
		int 숫자;
		int avg = 0;
		int index;
		System.out.println("나눌 값을 넣으시오.");
		숫자 = sc.nextInt();
		index = sc.nextInt();
		try {
		avg = 숫자 / index;
		} catch(ArithmeticException 오류) {
			System.out.println("오류!");
		}
		finally{
		System.out.println(숫자+"/"+index+"="+avg);
		}
		
	}

}
