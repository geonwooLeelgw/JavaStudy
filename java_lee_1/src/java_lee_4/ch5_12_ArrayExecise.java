package java_lee_4;
import java.util.*;
public class ch5_12_ArrayExecise {

	public static void main(String[] args) {
		String[][] words = {
				{"chair", "의자"},
				{"desk", "책상"},
				{"water", "물"},
				{"mointor", "모니터"},
				{"mouse", "마우스"}};
				int count=0;
				Scanner sc = new Scanner(System.in);
				
		for(int i=0;i<words.length;i++) {
				System.out.println("문제"+(i+1)+". "+words[i][0]+"의 뜻은 무엇인가요?");
				String input = sc.next();
				
				if(input.equals(words[i][1])){
					System.out.println("정답입니다.");
					count++;	
				}else {
					System.out.println("틀렸습니다.");
			}
		}
		double persent = (count/5)*100;
		System.out.println("총 "+(int)count+"개를 맞췄습니다.");
		System.out.println("총 "+persent+"% 입니다.");
		sc.close();
	}

}
