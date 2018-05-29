package java_lee_6;
//getter, setter 메소드를 사용하는 클래스
public class ch6_17_CarExample {

	public static void main(String[] args) {
		ch6_17_Car ca = new ch6_17_Car();
		
		//ca.speed=100; (x) = > private라 안됌
		//setter를 호출하여 속도 값을 설정
		/*ca.setSpeed(100);*/
		
		ca.setSpeed(100);
		System.out.println(ca.getSpeed());
		if(!ca.isStop()) {
			ca.setStop(true);
		}
		System.out.println("현재 속도 : "+ ca.getSpeed());
	}

}
