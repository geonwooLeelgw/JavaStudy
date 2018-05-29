package java_lee_5;

public class ch6_05_carExample {

	public static void main(String[] args) {
		//1. 기본 생성자를 이용한 객체 생성하여 필드 값 출력
		
		//2. model 매개변수 갖는 생성자를 이용한 객체 생성하여 필드값 출력
		
		//3. model, color 매개변수 갖는 생성자를 이용한 객체 생성하여 필드값 출력
		
		//4. m,c,ma매개변수 갖는 생성자를 이용한 객체 생성하여 필드값 출력
		
		ch6_05_car ca = new ch6_05_car();
		
		System.out.println("1번----------------------------");
		System.out.println(ca.company);
		System.out.println(ca.model);
		System.out.println(ca.color);
		System.out.println(ca.maxSpeed);
		
		ch6_05_car ca1 = new ch6_05_car("Martiz");
		System.out.println("2번-----------------------------");
		System.out.println(ca1.company);
		System.out.println(ca1.model);
		System.out.println(ca1.color);
		System.out.println(ca1.maxSpeed);
		
		ch6_05_car ca2 = new ch6_05_car("Santape","Yellow");
		System.out.println("3번-----------------------------");
		System.out.println(ca2.company);
		System.out.println(ca2.model);
		System.out.println(ca2.color);
		System.out.println(ca2.maxSpeed);
		
		ch6_05_car ca3 = new ch6_05_car("Tico","red",180);
		System.out.println("4번-----------------------------");
		System.out.println(ca3.company);
		System.out.println(ca3.model);
		System.out.println(ca3.color);
		System.out.println(ca3.maxSpeed);

	}

}
