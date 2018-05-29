package java_lee_9;

public class ch7_10_Main {

	public static void main(String[] args) {
		ch7_10_Sedan sd = new ch7_10_Sedan();
		ch7_10_Truck tc = new ch7_10_Truck();
		
		sd.Speed = 200; //Car의 자식이기 때문에 필드값을 물려 받는다.
		tc.Speed = 100; //Car의 자식이기 때문에 필드값을 물려 받는다.
		
		sd.Sit = 5; 
		tc.Box = 5;
		
		sd.color = "빨간색";//Car의 자식이기 때문에 필드값을 물려 받는다.
		tc.color = "검정색";//Car의 자식이기 때문에 필드값을 물려 받는다.
		
		System.out.println(sd.color+" 승용차의 속도는" +sd.Speed+"이고 좌석수는"+sd.SitDown()+"개 입니다.");
		sd.SpeedDown();
		//직접 필드 값을 가져와도 값이나옴
		System.out.println(sd.color+" 승용차의 속도는" +sd.Speed+"이고 좌석수는"+sd.Sit+"개 입니다.");
		System.out.println();
		System.out.println(tc.color+" 트럭의 속도는" +tc.Speed+"이고 적재량은"+tc.BoxIn()+"톤 입니다.");
	}

}
