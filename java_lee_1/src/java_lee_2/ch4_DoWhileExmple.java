package java_lee_2;
import java.util.*;
public class ch4_DoWhileExmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		String inputString;
		
		do {
			System.out.println(">");
			inputString = sc.nextLine();
			System.out.println(inputString);	
		}	
		while(!inputString.equals("q")); {
			
			System.out.println(inputString);
			inputString = sc.next();
		}
		System.out.println();
		System.out.println("프로그램 종료");
		sc.close();
	}

}
