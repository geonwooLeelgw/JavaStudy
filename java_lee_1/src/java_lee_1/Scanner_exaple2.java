package java_lee_1;
import java.util.*;
public class Scanner_exaple2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원의 반지름을 입력하세요 : ");
		
		int r;
		double rr;
		r = sc.nextInt();
		rr = r*r*3.14;
		System.out.println("원의 면적은"+rr+"입니다.");
		
		//math.PI => 3.141592......
	}

}
