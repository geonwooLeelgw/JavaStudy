package java_lee_1;

import java.util.*;
public class Scanner_example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int sec;
		int t1;
		int t2;
		int t3;
		System.out.print("초를 입력하세요:");
		
		sec = sc.nextInt();
		
		t1 = sec / 3600;
		t2 = (sec % 3600)/60;
		t3 = ((sec % 3600)%60);
		
		System.out.println(sec+"초는 "+t1+"시간 "+t2+"분 "+t3+"초입니다.");
		sc.close();
	}

}
