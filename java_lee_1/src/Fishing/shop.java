package Fishing;
import java.util.*;
public class shop {
	Scanner sc = new Scanner(System.in);
	int input; // 처음 입력 변수
	int input2; //낚시대 구입용 입력 변수
	int input3; // 물고기,낚싯대 판매용 변수
	int input4; // 물고기 판매용 변수
	int food; // 먹이
	int money=50000; //수중에 가지고 있는돈 초기값 50000
	int myrod=0;//내 낚싯대 현재 확률 0퍼센트
	public void enterShop() {
		do {
		System.out.println("1.먹이 구입"+"  "+"2.낚시대 구입"+"  "+"3.판매"+"  "+"4.상점 나가기");
		System.out.print(">>");
		input = sc.nextInt();
		if(input==1) {
			System.out.println("먹이는 개당 1000원 입니다.");
			System.out.println("현재 보유 자산은: "+money+"입니다.");
			System.out.println("구매할 갯수를 입력해 주세요.");
			System.out.print(">>");
			if(0>(money-(food*1000)))
			System.out.println("보유 자산이 부족합니다.");
			else {
				food = sc.nextInt();
				System.out.println(food+"개 구입 성공!");
			}}
		if(input==2) {
			System.out.println("1번: Normal 낚싯대 : 39000원");
			System.out.println("2번: Rare 낚싯대 : 45000원");
			System.out.println("3번: Unique 낚싯대 : 49000원");
			System.out.println("4번 : 상위 메뉴로");
			System.out.print("번호를 입력해주세요 : ");
			input2 = sc.nextInt();
			if(input2==1) {
				System.out.println("Normal 낚싯대를 구입하셨습니다.");
				FishingRod rod1 = new FishingRod();
				myrod = rod1.Normal;
			}
			if(input2==2) {
				System.out.println("Rare 낚싯대를 구입하셨습니다.");
				FishingRod rod2 = new FishingRod();
				myrod = rod2.Rare;
			}
			if(input2==3) {
				System.out.println("Unique 낚싯대를 구입하셨습니다.");
				FishingRod rod3 = new FishingRod();
				myrod = rod3.Unique;
			}else {
				break;
			}
		}
		if(input==3) {
			System.out.println("1.물고기판매      2.낚싯대 판매");
			System.out.print(">>");
			input3 = sc.nextInt();
			if(input3==1) {
				//내 수족관에 있는 물고기 정보를 가져온다.
				System.out.println("현재 내가 잡은 물고기들...");
				//물고기들의 이름과 가격정보를 보여준다 , 모두 판매로 안하면 엄청 복잡해짐
				System.out.println("모두 판매하시겠습니까? Yes:1번");
				System.out.println("상위 메뉴 Go:2번");
				System.out.print(">>");
				input4 = sc.nextInt();
				if(input4==1) {
					// 물고기 금액에 맞는 돈을 money에 +해서 대입한다.
					System.out.println("판매되었습니다.");
					System.out.println("현재 보유 Money는 "+money+"원 입니다.");
				}
				if(input4==2) {
					break;
				}
			}
		}

}
		while(input!=4);
		
	}}

