package java_lee_10;
import java.util.*;
public class TicketExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int select=0;
		//가격은 20000원으로 고정 시킨다.	
		WalkUpTicket wtc = new WalkUpTicket(100,20000,0);
		AdvancedTicket atc = new AdvancedTicket(100,20000,0);
		
		while(select!=3) {
			System.out.println("일반 티켓 1번 | 예약 티켓 2번 | 종료 3번 ");
			System.out.print(">>");
			select = sc.nextInt();
		if(select == 1) {
			System.out.println("현금결제 1번 | 카드결제 2번");
			System.out.print(">>");
			wtc.select = sc.nextInt();
			wtc.num();
			System.out.println("일반 티켓번호: "+wtc.num+" 구매가격: "+(int)wtc.normalTicket()+"원");
		}
		if(select ==2) {
			System.out.println("예약을 몇 일 전에 하셨습니까? ex)30일 전 30 입력");
			System.out.print(">>");
			atc.reservation = sc.nextInt();
			atc.num();
			System.out.println("예약 티켓번호: "+atc.num+" 구매가격: "+(int)atc.ReservationDiscount()+"원");
		}
		}
		sc.close();
	}

}
