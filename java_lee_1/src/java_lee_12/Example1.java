package java_lee_12;

import java.util.*;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		
		System.out.println("5명의 이름을 영어로 입력하시오.");
		for(int i=0;i<5;i++) {
			name = sc.next();
			list.add(name);
		}
		
		
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(str);
			
		}
		String str1 = list.get(0);
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			if(str.length()>str1.length()) {
			str1 = list.get(i);
			}
		}
		System.out.println();
		System.out.println("가장 긴 이름은: "+str1);
	}

}
