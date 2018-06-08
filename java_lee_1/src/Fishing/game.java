package Fishing;
import java.util.*;

public class game {
	
	Scanner sc = new Scanner(System.in);	
	
	int select;
	int select1;
	shop sh = new shop();
	login log=new login();
	

		public void stageselect() { //게임 시작을 눌렀을때 이 메소드 호출
			System.out.println("========== 스테이지 선택 =====");
	    	System.out.println("|1. 바다  |2. 민물    |3.이전으로 |");
	    	System.out.println("=========================");
	    	select = sc.nextInt();
	    	if(select == 1 || select == 2) 
	    		sea();
	    	else if(select == 3) 
	    		log.gamem();
	    	else {
	    		System.out.println("잘못된키입니다.");
	    		stageselect();
	    	}
		}
		
		public void sea() {
			
			int k = 2;//점점 증가시켜서 랜덤값과 같게 한다
			int select1;
			int  i = (int)(Math.random()*30)+5;
			int value = (int)(Math.random()*15)+1;
			String yes;
			System.out.println("낚시찌를 던지시겠습니까?  y/n");
			yes = sc.next();
			if(yes.equals("y")) {
			try {
				if(sh.myrodName.equals(null)) {
					
				}
			
			}catch(NullPointerException e) {
				System.out.println("낚시대가 없습니다. 낚시대를 구매하세요.");
				System.out.println("이전으로 >1");
				select1 = sc.nextInt();
				if(select1 == 1) {
					log.gamem();
			}}
			if(sh.foodnum<1) {
				System.out.println("먹이가 없습니다. 먹이를 구매하세요.");
				System.out.println("이전으로 >1");
				select1 = sc.nextInt();
				if(select1 == 1) {
					log.gamem();
			}
				
			}
				try{	
					System.out.println("낚시찌를 던졌습니다.");
					 --sh.foodnum;
					 System.out.println("던진 거리 : "+i+"m");//던진거리 5~30m
					 System.out.println("남은  먹이의 수:"+sh.foodnum+"개");
					 System.out.print("낚시중");
				        while(k!=i) {
				 		System.out.print(".");
						Thread.sleep(1000);
						k++;
						 if(k==i) {
							 System.out.println();
							 sea2(); 
						 }
						
				        }
				                
				}catch(Exception e) {
				        	System.out.println(e.getMessage());
				        }
			}
			else if(yes.equals("n")) {
				stageselect();
			}else {
				System.out.println("잘못된 키입니다.");
				sea();
			}
		}
		
		
		public void sea2() {
			String select = null;
			int persent = (int)(Math.random()*8)+1;
			
			try{ 
				System.out.println("물고기가 낚시찌를 물었습니다!");
			    Thread.sleep(2000);
           
            if(sh.myrodName.equals("Normal")) {
		if(persent==1 || persent==5) {
			fishinfo();	
		
            }else {
			System.out.println("물고기가 도망쳤습니다.");
		    	sea();
            }}
		if(sh.myrodName.equals("Rare")) {
			if(persent==1 || persent==2 || persent == 7 || persent ==5) {
				fishinfo();	
			
		    }else {
			System.out.println("물고기가 도망쳤습니다.");
				 sea();
		}}
	
		if(sh.myrodName.equals("Unique")) {
			
					fishinfo();
		}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
			
		}
		
		static int SeaNumber;
		static int FreshNumber;
		public void fishinfo() {
	    System.out.println("물고기를 잡았습니다!");
	    
	    fishes fishp=new fishes();
	    	if(select==1) {
	    		
	    		SeaNumber++;
	    		fishp.sea();
	    		
	       }else if(select==2) {
	    	   FreshNumber++;
	    		fishp.fresh2();
	    }
	    	
	    	
	    	sea();
		}
	}
