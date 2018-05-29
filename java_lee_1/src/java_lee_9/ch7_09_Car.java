package java_lee_9;

public class ch7_09_Car {
	//필드 (초기값)
	ch7_09_Tire frontLeftTire = new ch7_09_Tire("앞왼쪽",6);
	ch7_09_Tire frontRightTire = new ch7_09_Tire("앞오른쪽",2);
	ch7_09_Tire backLeftTire = new ch7_09_Tire("뒤왼쪽",3);
	ch7_09_Tire backRightTire = new ch7_09_Tire("뒤오른쪽",4);
	//배열로 선언
	/*ch7_09_Tire[] tire = new ch7_09_Tire[100];
	ch7_09_Tire[] tire1 = { new ch7_09_Tire("앞왼쪽", 6),new ch7_09_Tire("앞오른쪽",2),
							new ch7_09_Tire("뒤왼쪽", 3),new ch7_09_Tire("뒤오른쪽", 4)};
	*/
	//메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll()==false) { //펑크나면 1리턴
			stop(); return 1;
		}
		if(frontRightTire.roll()==false) { //펑크나면 2리턴
			stop(); return 2;
		}
		if(backLeftTire.roll()==false) { //펑크나면 3리턴
			stop(); return 3;
		}
		if(backRightTire.roll()==false) { //펑크나면 4리턴
			stop(); return 4;
		}
		return 0; //아무일 없으면 0리턴
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
