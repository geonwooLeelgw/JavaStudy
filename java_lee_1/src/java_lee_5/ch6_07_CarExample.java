package java_lee_5;

public class ch6_07_CarExample {

	public static void main(String[] args) {
		ch6_07_Car ca = new ch6_07_Car();
		ca.setGas(5); // setGas 메소드 호출, 매개값은 5
		
		//isLeftGas 메소드 호출결과를 gasState라는 변수에 담으세요.
		boolean gasState = ca.isLeftGas();
		
		if(gasState==true) {
			System.out.println("출발합니다.");
			ca.run();
		}
		//여기까지 실행됬을때 gas필드 값은??
		System.out.println(ca.isLeftGas());
		System.out.println(ca.gas);
		if(ca.isLeftGas()) { //ca.isLeftGas() = 0(false) =>gas가 없습니다.
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입하세요.");
		}

	}

}
