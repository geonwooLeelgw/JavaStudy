package Fishing;

import java.util.Scanner;

public class fishcase {
//수조관
	Scanner sc=new Scanner(System.in);
	
	//닉네임,물고기종류 ,길이
	
	
	
	void fishroom() {
		login log=new login();
		
		shop shop=new shop();
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
