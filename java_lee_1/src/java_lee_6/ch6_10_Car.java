package java_lee_6;

public class ch6_10_Car {
	int Speed=10;
	String model;
	
	//생성자의 이름은 class와 동일하게 사용
	ch6_10_Car(String model){
		this.model=model;
	}
	//일반출력으로 하기때문에 void 타입
	void run() {
		while(true) {
			if(Speed<=50) {
			System.out.println(model+"가 달립니다.(시속:"+Speed+"km/h)");
			Speed += 10;
		}
			else {
			return;
		}
	}
}}
