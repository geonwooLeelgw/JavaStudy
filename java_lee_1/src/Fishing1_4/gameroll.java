package Fishing1_4;

import java.util.Scanner;

public class gameroll {
	Scanner sc = new Scanner(System.in);
	
void sea1() {//게임 시작 질문을 위한 메소드
		shop sh=new shop(); //shop 클래스 객체
		login log=new login(); // login 클래스 객체
		int k = 2;
		int select1;
		int value = (int)(Math.random()*25)+5;
		int  i = (int)(Math.random()*10)+5; // 5~15까지 랜덤 "."을 찍어주기위한 랜덤 변수
		System.out.println("낚시찌를 던지시겠습니까?  y/n");
		String yes = sc.next();
		
		if(yes.equals("y")) { //y입력을 받으면
			try {
		if(sh.myrodName.equals(null)) { //myrodName이 null이라면
			
		}
	
			}catch(NullPointerException e) {
		System.out.println("낚시대가 없습니다. 낚시대를 구매하세요."); // null값을 잡아서 출력문
		System.out.println("이전으로 >1");
		select1 = sc.nextInt();
		if(select1 == 1) {
			log.gamem();
		}}
			if(sh.foodnum<1) { //먹이가 1보다 작으면
		System.out.println("먹이가 없습니다. 먹이를 구매하세요.");
		System.out.println("이전으로 >1");
		select1 = sc.nextInt();
			if(select1 == 1) {
			log.gamem();
	}
		
	}
			try{	
			System.out.println("낚시찌를 던졌습니다.");
			 --sh.foodnum; //낚시찌를 던지면 먹이 갯수 -1개
			 System.out.println("던진 거리 : "+value+"m");//던진거리 5~30m
			 System.out.println("남은  먹이의 수:"+sh.foodnum+"개"); //먹이갯수 출력
			 System.out.print("낚시중");
		        while(k!=i) { //위에서 선언한 i값과 k값이 다를동안 "."을 찍고
		 		System.out.print("."); 
				Thread.sleep(500);
				k++;
				 if(k==i) { //같다면 sea2()를 호출
					 System.out.println();
					 sea2(); 
				 }
				
		        }
		                
		}catch(Exception e) {
		        	System.out.println(e.getMessage());
		        }
	}
	else if(yes.equals("n")) {
		menu menu=new menu();
		menu.stageselect();
	}else {
		System.out.println("잘못된 키입니다.");
		sea1();
	}
}
 
 public void sea2() { //게임 룰
	 shop sh=new shop();
		int persent = (int)(Math.random()*8)+1;
		
		try{ 
			System.out.println("물고기가 낚시찌를 물었습니다!");
		    Thread.sleep(2000);
    
     if(sh.myrodName.equals("Normal")) {
	if(persent==1 || persent==5) {
		fishinfo();	
	
     }else {
		System.out.println("물고기가 도망쳤습니다.");
		sea1();
     }}
	if(sh.myrodName.equals("Rare")) {
		
		if(persent==1 || persent==3 || persent == 5 || persent ==7) {
			fishinfo();	
		
	    }else {
		System.out.println("물고기가 도망쳤습니다.");
		sea1();
	}}

	if(sh.myrodName.equals("Unique")) {
		
				fishinfo();
	}
	}catch(Exception e){
		System.out.println(e.getMessage());
	}
		
		
	}

	public void fishinfo() { //게임결말
		fishes fishes = new fishes();
 	System.out.println("물고기를 잡았습니다!");
 	menu menu=new menu();
 	if(menu.select==1) {
 		
 		fishes.sea();
 	}else if(menu.select==2) {
 		
 		fishes.fresh2();
 	}
 	sea1();
 
	}
}