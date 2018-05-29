package java_lee_5;

public class ch6_02_carExample {

	public static void main(String[] args) {
		//Car 클래스 객체 선언
		//Car 클래스에서 선언한 필드 값을 출력해보세요.
		
		ch6_02_car ca = new ch6_02_car(); //ca객체 생성
		
		System.out.println(ca.company); //car 클래스의 company 필드 값
		System.out.println(ca.color); //car 클래스의 color 필드 값
		System.out.println(ca.model); //car 클래스의 model 필드 값
		System.out.println(ca.maxSpeed); //car 클래스의 maxSpeed 필드 값
		System.out.println(ca.speed); //car 클래스의 speed 필드 값
		
		//필드 값 변경
		ca.speed = 60;
		System.out.println(ca.speed);
		
	}

}
