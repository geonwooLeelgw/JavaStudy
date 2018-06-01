package java_lee_12;
import java.util.*;
public class ch15_03_HashsSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("Jdnc");
		set.add("se");
		set.add("1");
		set.add("2");
		set.add("1"); //Set은 중복된 값이 들어오게 되면 1개로 처리
		
		int size = set.size();
		System.out.println("set에 담긴 총 데이터 수 "+size);
		
		//Set에 들어있는 모든 데이터 가져오기
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		
		set.remove("Java");
		
		//set에 있는 내용 전체 삭제
		set.clear();
		set.isEmpty();
	}

}
