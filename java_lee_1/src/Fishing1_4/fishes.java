package Fishing1_4;

import java.util.Scanner;

public class fishes {
	
	static fish[] sea=new fish[10]; //바다 물고기 배열
	static fish[] fresh2=new fish[10]; //민물 물고기 배열
	static fish[] fishcasew=new fish[10]; // 수족관 배열
	static int z=0; // 수족관 배열의 인덱스 번호를 위한 변수
	static int num=0; // 따로 숫자를 증가시킨다.(shop클래스에서 사용하기 위해)
	static int price=0; // 가격을 계산해서 저장하기위한 변수
	
	Scanner sc=new Scanner(System.in); //스캐너 소환!
	
	
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
	
	int i=(int)((Math.random()*9)); // 물고기들이 0~9번중에 하나의 물고기만 나오도록 하는 랜덤 변수
	//랜덤한 물고기의 정보를 출력해주는 출력문
	System.out.println(i+"번 품종"+"."+sea[i].fishlength+"cm "+sea[i].fishname+"(이)가 잡혔습니다.");
	
	String fishname=sea[i].fishname; //바다물고기 배열의 이름을 저장하기위한 변수
	int fishlength=sea[i].fishlength; //바다물고기 배열의 길이를 저장하기위한 변수
	int fishprice=sea[i].fishprice; //바다물고기 배열의 가격을 저장하기위한 변수
	
	if(fishlength>=20) { //물고기의 길이가 20cm 이상일때 가격의 1.5배를 fishprice변수의 대입한다.
			fishprice = (int)(fishprice*(1.5));
		}
	
		 fish fishcase=new fish(fishname,fishlength,fishprice); // 위에서 저장한 값들을 fishcase객체에 대입한다.
		 fishcasew[z] = fishcase; //fsihcasew 배열 안에 fishcase객체를 대입
		 price+=fishprice;
		 z++; //이 메소드가 실행될때 z를 증가시킨다.(배열값에 대입하기위한 값)
		 num++; // 다른클래스에서 사용하기위한 값
		}
 
	void fresh2() { //민물 물고기종류 , sea()메소드와 같은 구조
		
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

		System.out.println(i+"번 품종"+"."+fresh2[i].fishlength+"cm "+fresh2[i].fishname+"(이)가 잡혔습니다.");
		
		String fishname = fresh2[i].fishname;
		int fishlength = fresh2[i].fishlength;
		int fishprice = fresh2[i].fishprice;
		
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
		login log=new login(); //닉네임을 가져오기위한 객체
		int i=0; //배열을 가져오기위한 변수
		System.out.println(log.necname+"님의 수조관"); // 닉네임 출력문
		
		while(i<num) {//배열을 사용해 내 수족관에 들어갔을때 잡은 물고기를출력
		 System.out.println("물고기 길이: "+fishcasew[i].fishlength+"cm |물고기 종류: "+fishcasew[i].fishname+" |물고기 시세: "+fishcasew[i].fishprice+"원");
		 i++;
	}
				
		System.out.println("1.나가기");
		int num=sc.nextInt(); //입력값을 받기위한 변수
		if(num==1) log.gamem(); //입력이 1이면 gamem()메소드 호출
		else {System.out.println("잘못된키입니다.");
		fishroom();}
			
		
}
}






			




