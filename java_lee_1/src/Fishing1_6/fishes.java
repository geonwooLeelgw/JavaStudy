package Fishing1_6;

import java.util.Scanner;

public class fishes {
	//바다 물고기
	 String fishname;
	 int fishlength;
	 int fishprice;
	 static fish[] sea=new fish[10];
	 static fish[] fresh2=new fish[10];

	static fish[] fishcasew=new fish[10];
	static int z=0;
	static int num=0;
	static int price=0;
	fishingrod fishingrod = new fishingrod();

	Scanner sc=new Scanner(System.in);
	
	
 void sea() {//바다물고기 정보
	
	sea[0] = new fish("홍어" , (int)((Math.random()*30)+1) , 5000);
	sea[1] = new fish("아귀" , (int)((Math.random()*30)+1) , 3000);
	sea[2] = new fish("무지개쥐돔",(int)((Math.random()*30)+1) , 8000);
	sea[3] = new fish("황물퉁돔" , (int)((Math.random()*30)+1) , 7000);
	sea[4] = new fish("고래상어" , (int)((Math.random()*30)+1) , 15000);
	sea[5] = new fish("정어리" , (int)((Math.random()*30)+1) , 2000);
	sea[6] = new fish("곰치" , (int)((Math.random()*30)+1) , 1500);
	sea[7] = new fish("넙치" , (int)((Math.random()*30)+1) , 3500);
	sea[8] = new fish("멸치" , (int)((Math.random()*30)+1) , 800);
	sea[9] = new fish("쥐치" , (int)((Math.random()*30)+1) , 1000);
int i=(int)((Math.random()*9));

System.out.println(i+"번 품종"+"."+sea[i].fishlength+"cm "+sea[i].fishname+"가 잡혔습니다.");
		String fishname=sea[i].fishname;
		int fishlength=sea[i].fishlength;
		int fishprice=sea[i].fishprice;
		if(fishlength>=20) {
			fishprice=(int) (fishprice*(1.5));
		}
		fish fishcase=new fish(fishname,fishlength,fishprice);
		 fishcasew[z]=fishcase;
		price+=fishprice;
		 z++;
		 num++;
		}
	void fresh2() { //민물 물고기종류
	//민물 
		fresh2[0] = new fish("독중개",(int)((Math.random()*30)+1),8000);
		fresh2[1] = new fish("꺽지",(int)((Math.random()*30)+1),6000);
		fresh2[2] = new fish("다묵장어",(int)((Math.random()*30)+1),9000);
		fresh2[3] = new fish("돌고기",(int)((Math.random()*30)+1),3000);
		fresh2[4] = new fish("모래무지",(int)((Math.random()*30)+1),2000);
		fresh2[5] = new fish("밀어",(int)((Math.random()*30)+1),1000);
		fresh2[6] = new fish("쉬리",(int)((Math.random()*30)+1),8000);	
		fresh2[7] = new fish("쏘가리",(int)((Math.random()*30)+1),11000);	
		fresh2[8] = new fish("은어",(int)((Math.random()*30)+1),10000);	
		fresh2[9] = new fish("금어",(int)((Math.random()*30)+1),20000);	
		int i=(int)((Math.random()*9));

		System.out.println(i+"번 품종"+"."+fresh2[i].fishlength+"cm "+fresh2[i].fishname+"가 잡혔습니다.");
		String fishname=fresh2[i].fishname;
		int fishlength=fresh2[i].fishlength;
		int fishprice=fresh2[i].fishprice;
		if(fishlength>=20) {
			fishprice+=(1.5)*fishprice;
		}
		
		fish fishcase=new fish(fishname,fishlength,fishprice);
		 fishcasew[z]=fishcase;
			price+=fishprice;
		 z++;
		 num++;
		
}
		
			
void fishroom() {//수조관
			login log=new login();
			shop sh=new shop();
		int o=sh.l;
			
			System.out.println(      log.necname2+"님의 수조관");

				while(o<num) {
					
					System.out.println("물고기 길이: "+fishcasew[o].fishlength+"cm |물고기 종류: "+fishcasew[o].fishname+" |물고기 시세: "+fishcasew[o].fishprice+"원");
				o++;
				}
				
				System.out.println("1.나가기");
			
			int num0=sc.nextInt();
			if(num0==1) {
				log.gamem();
			}
			else {
				System.out.println("잘못된키입니다.");
			}
		
}

	}







			




