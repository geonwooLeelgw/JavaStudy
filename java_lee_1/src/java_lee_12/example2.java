package java_lee_12;

import java.util.*;

public class example2 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>() ;
		
		map.put("apple","사과");
		map.put("banana","바나나");
		map.put("grape","포도");
		
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			System.out.print("단어 입력: ");
			String eng =sc.next();
			
			String kor = map.get(eng);
			if(kor==null) {
				System.out.println("사전에 없는 단어 입니다.");
			} else {
				System.out.println("단어의 의미는 :" +kor);
			}
		}
		}
	
}
