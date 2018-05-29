package java_lee_3;
import java.util.*;
public class ch4_22_example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int select = sc.nextInt(); //선택
		int input = sc.nextInt(); //예금
		int money=0; //돈
		System.out.println("-----------------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 |");
		System.out.println("-----------------------------------");
		System.out.print("선택>");
		input = sc.nextInt();
		
		do {
			
			
			if(select==1) {
				System.out.print("예금>");
				input = sc.nextInt();
				money += input;
			}
			
			
			}
			while(true); 
			
	}

}
