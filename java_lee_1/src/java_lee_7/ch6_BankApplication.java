package java_lee_7;
import java.util.*;
public class ch6_BankApplication {
	//account 클래스 타입의 accountArray 배열을 선언
	private static ch6_Account[] accountArray = new ch6_Account[100];
	private static  Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 ");
			System.out.println("----------------------------------------");
			System.out.print("선택>");
			
			int selectNo = sc.nextInt();
			
			if(selectNo==1) {
				createAccount();
			} else if(selectNo==2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	static int i = 0;
	private static void createAccount() {
		System.out.println("----------");
		System.out.println("계좌생성");
		System.out.println("----------");
		System.out.print("계좌번호: ");
		String num = sc.next();
		System.out.print("계좌주: ");
		String owner = sc.next();
		System.out.print("초기입금액: ");
		int balance = sc.nextInt();
		//입력받은 값을 이용하여 Account 클래스에 대한 객체  생성
		ch6_Account ac = new ch6_Account(num,owner,balance);
		//입력 받은 값을 배열 변수에 하나씩 저장
		accountArray[i]=ac;
		//ac.getAno(), ac.getName(), ac.getBalance()
		System.out.println("계좌가 생성되었습니다.");
		i++;
		
	}
	static int k = 0;
		private static void accountList() {
		System.out.println("----------");
		System.out.println("계좌목록");
		System.out.println("----------");
		k=0;
		//Acount 클래스 타입의 account 변수 판단
		//입력된 고객의 계좌번호, 계좌주, 잔액
		//ch6_Account account = accountArray[i];
		while(i>k) {
		System.out.println(accountArray[k].getAno()+"  "+accountArray[k].getOwner()+
				"  "+accountArray[k].getBalance());
			
		k++;
		}
		
	}
	static int j = 0;
	private static void deposit() {
		System.out.println("----------");
		System.out.println("예금");
		System.out.println("----------");
		System.out.print("계좌번호: ");
		String num = sc.next();
		System.out.print("예금액: ");
		int balance = sc.nextInt();
		int hello=0;
		j=0;
		while(j<i){
		if(accountArray[j].getAno().equals(num)) {
			accountArray[j].set1Balance(balance);
			System.out.println(accountArray[j].getBalance());
			hello =1;
			break;
		}
		else {
			hello =2;
		}
		j++;
		}
		if(hello==1) {
			System.out.println("결과: 예금이 성공되었습니다.");
		} else System.out.println("결과: 계좌번호 불일치");
		
	}
	static int h = 0;
	private static void withdraw() {
		System.out.println("----------");
		System.out.println("출금");
		System.out.println("----------");
		System.out.print("계좌번호: ");
		String num = sc.next();
		System.out.print("출금액: ");
		int balance = sc.nextInt();
		int hello = 0;
		h=0;
		while(h<i){
		if(accountArray[h].getAno().equals(num)) {
			accountArray[h].set2Balance(balance);
			System.out.println(accountArray[h].getBalance());
			hello = 1;
			break;
		}else hello = 2;
		h++;
		}
		if(hello==1) System.out.println("결과: 출금이 성공되었습니다.");
		else System.out.println("결과: 계좌번호 불일치");
	}
		//ch6_Account account = findAccount(ano); => 타입이 클래스!
		//고객이 입력한 계좌번호와 저장되어있는 계좌번호에 대해 일치여부를 판단하는 메소드
		//매게변수 ano
		//리턴타입 Account 클래스
		private static ch6_Account findAccount(String ano) {
			ch6_Account account = null;
			for (int i=0;i<accountArray.length;i++) {
			if(accountArray[i]!=null) {
				String dbAno = accountArray[i].getAno();
				if(dbAno.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
			return account;
	}
}