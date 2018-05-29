package java_lee_9;

public class ch7_09_CarExample {

	public static void main(String[] args) {
		//객체 생성
		//Car 클래스 타입 변수 car 선언
		ch7_09_Car car = new ch7_09_Car();
		
		//부모 클래스 타입의 변수 선언
		ch7_09_Tire tire = new ch7_09_Tire("aaa",10);
		//자식클래스 타입의 변수 선언
		ch7_09_HankookTire hktire = new ch7_09_HankookTire("한국",10);
		
		tire = hktire;//자식클래스 타입 변수를 부모클래스 타입 변수에 대입
		hktire = (ch7_09_HankookTire)tire;//부모클래스 타입 변수를 자식클래스타입 변수에 대입 불가능하므로 캐스팅함
		
		//반복문 5번 실행!
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation){
				case 1:
					System.out.println("앞왼쪽 HankookTire로 교체");
					car.frontLeftTire = new ch7_09_HankookTire("앞왼쪽",15);
					break;
				case 2:
					System.out.println("앞오른쪽 kumhoTire로 교체");
					car.frontRightTire = new ch7_09_HankookTire("앞오른쪽",13);
					break;
				case 3:
					System.out.println("뒤왼쪽 HankookTire로 교체");
					car.backLeftTire = new ch7_09_HankookTire("뒤왼쪽",14);
					break;
				case 4:
					System.out.println("뒤오른쪽 kumhoTire로 교체");
					car.backRightTire = new ch7_09_HankookTire("뒤오른쪽",17);
					break;
			}
			System.out.println("-------------------------------");
 		}
	}

}
