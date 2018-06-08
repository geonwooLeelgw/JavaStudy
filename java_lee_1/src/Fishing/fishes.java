package Fishing;

public class fishes {
	//바다 물고기
	public static String fishname;
	public static int fishlength;
	public static int fishprice;
	
	
 void sea() {
	 
	 fish fish=new fish(null, 0, 0);
	fish[] sea=new fish[10];
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
		
		System.out.println(i+"번 품종"+"."+sea[i].length+"cm "+sea[i].name+"가 잡혔습니다.");
		fishname=sea[i].name;
		fishlength=sea[i].length;
		fishprice=sea[i].price;
		}
	
		
	void fresh2() { 
		fish[] fresh2=new fish[10];
	//민물 2급수
		fresh2[0] = new fish("독중개",(int)((Math.random()*30)+1),8000);
		fresh2[1] = new fish("꺽지",(int)((Math.random()*30)+1),6000);
		fresh2[2] = new fish("다묵장어",(int)((Math.random()*30)+1),9000);
		fresh2[3]= new fish("돌고기",(int)((Math.random()*30)+1),3000);
		fresh2[4] = new fish("모래무지",(int)((Math.random()*30)+1),2000);
		fresh2[5] = new fish("밀어",(int)((Math.random()*30)+1),1000);
		fresh2[6] = new fish("쉬리",(int)((Math.random()*30)+1),8000);	
		fresh2[7] = new fish("쏘가리",(int)((Math.random()*30)+1),11000);	
		fresh2[8] = new fish("은어",(int)((Math.random()*30)+1),10000);	
		int i=(int)((Math.random()*8));

		System.out.println(i+"번 품종"+"."+fresh2[i].length+"cm "+fresh2[i].name+"가 잡혔습니다.");
		fishname=fresh2[i].name;
		fishlength=fresh2[i].length;
		fishprice=fresh2[i].price;
		
}}