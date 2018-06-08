package Fishing;

import java.util.Scanner;

import Fishing.fishes;

public class fishcase {
//수조관
	Scanner sc=new Scanner(System.in);
	fishes fishe=new fishes();
	//닉네임,물고기종류 ,길이
	
	
	
	void fishroom() {
	shop shop=new shop();
	game gm = new game();
	login log =new login();
	System.out.println(log.save+"님의 수조관");
	System.out.println("현재 바다에서 잡은 물고기: "+gm.SeaNumber+"마리");
	System.out.println("현재 민물에서 잡은 물고기: "+gm.FreshNumber+"마리");
	System.out.println("1.상점  2.나가기");
	
	int num0=sc.nextInt();
	if(num0==2) {
		log.gamem();
		
	}else if(num0==1) {
		shop.enterShop();
	}
	else {
		System.out.println("잘못된키입니다.");
	}
	}
	
}
