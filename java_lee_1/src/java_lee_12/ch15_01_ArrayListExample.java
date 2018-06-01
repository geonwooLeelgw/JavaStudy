package java_lee_12;

import java.util.List;
import java.util.ArrayList;

//Array 예제
public class ch15_01_ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		//<> :제네릭(Generic) (q번거로운 타입제거)

		list.add("홍길동");
		String name = list.get(0);
				System.out.println(name);
				
		/*
		 * 제네릭 전 기존방식
		 * List list = new ArrayList();
		 * list.add("홍길동");
		 * Obecy onj = list.get(홍
		 * 
		 */	

		
		list.add("java");
		list.add("JTBC");
		list.add("Servlet/JDP");
		list.add(2, "database");
		list.add("myBatis");
		
		int size= list.size();
		System.out.println("list의 크기"+size);
		System.out.println();
		
		String skill =list.get(2);
		System.out.println("2번 인덱스에 담긴 데이터"+skill);
		System.out.println();
		
		//list에 담긴
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(str);
		}
		//list에 담긴 데이터 삭제
		list.remove(2);//Database
		list.remove(2);//
		System.out.println();
		
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(str);
		}
				
		
	}

}
