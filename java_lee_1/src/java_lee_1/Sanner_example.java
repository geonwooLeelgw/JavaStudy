package java_lee_1;

import java.util.*;
public class Sanner_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String name;
		String city;
		int age;
		double kg;

		System.out.println("이름, 도시, 나이 ,체중을 빈칸으로 분리하여 입력하세요 : ");
		
		name = sc.next();
		city = sc.next();
		age = sc.nextInt();
		kg = sc.nextDouble();
		
		System.out.println("당신의 이름은" +name+ "입니다.");
		System.out.println("당신이 사는 도시는" +city+ "입니다.");
		System.out.println("당신의 나이는" +age+ "입니다.");
		System.out.println("당신의 체중은" +kg+ "입니다.");
		sc.close();
		
		
	}

}
