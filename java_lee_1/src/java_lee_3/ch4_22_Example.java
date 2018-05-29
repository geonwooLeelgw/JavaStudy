package java_lee_3;
import java.util.*;
public class ch4_22_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----------------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 |");
		System.out.println("-----------------------------------");
		System.out.print("선택>");
		int select = sc.nextInt(); //입력 선택
		System.out.print("예금액>");
		int input = sc.nextInt(); // 넣을 금액
		int sum = 0; //예금
		while(select!=4) {
		if(select==1) {
			sum += input;
			System.out.println("현재잔액은 "+sum+"입니다.");
			System.out.println("-----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 |");
			System.out.println("-----------------------------------");
			System.out.print("선택>");
			select = sc.nextInt();
			if(select==3) {
				System.out.print("잔고>");
			}else if(select==1){
			System.out.print("예금액>");
			input = sc.nextInt();}
			else if(select==2) {
			System.out.print("출금액>");
			input = sc.nextInt();}}
			
		if(select==2 && ((sum-input)>0)) {
			sum -= input;
			System.out.println("-----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 |");
			System.out.println("-----------------------------------");
			if(select==3) {
				System.out.print("잔고>");
			}else if(select==1){
			System.out.print("예금액>");
			input = sc.nextInt();}
			else if(select==2) {
			System.out.print("출금액>");
			input = sc.nextInt();}
		}else if(select==2 && ((sum-input)<0)) {
			System.out.println("잔고가 부족합니다.");
			System.out.println("현재잔액은 "+sum+"입니다.");
			System.out.println("-----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 |");
			System.out.println("-----------------------------------");
			if(select==3) {
				System.out.print("잔고>");
			}else if(select==1){
			System.out.print("예금액>");
			input = sc.nextInt();}
			else if(select==2) {
			System.out.print("출금액>");
			input = sc.nextInt();}
		}
		else if(select==3) {
			System.out.print("현재잔액은" +sum+"입니다.");
			System.out.println("-----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 |");
			System.out.println("-----------------------------------");
			if(select==3) {
				System.out.print("잔고>");
			}else if(select==1){
			System.out.print("예금액>");
			input = sc.nextInt();}
			else if(select==2) {
			System.out.print("출금액>");
			input = sc.nextInt();}
		}
		else {
			System.out.println("1~4만 입력하시오.");
			System.out.println("-----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 |");
			System.out.println("-----------------------------------");
			if(select==3) {
				System.out.print("잔고>");
			}else if(select==1){
			System.out.print("예금액>");
			input = sc.nextInt();}
			else if(select==2) {
			System.out.print("출금액>");
			input = sc.nextInt();}
		}
		}
		
		System.out.println("종료 되었습니다.");
	}

}
