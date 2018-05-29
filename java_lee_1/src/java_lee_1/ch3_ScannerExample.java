package java_lee_1;

import java.util.*;
public class ch3_ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String name;
		System.out.print("당신의 이름을 입력해주세요 : ");
		name = sc.next(); //.next() 문자열 입력을 위한 스캐너의 메소드
		System.out.println("당신의 이름은"+name+"입니다.");
		sc.close();
	}

}
// next() : 문자열 입력
// nextInt() : 정수입력
// nextDouble() : 실수입력
// close() : 스캐너 종료