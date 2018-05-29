package java_lee_9;
//자동타입변환 예제(자식클래스->부모클래스타입
//A클라스 새샺ㅇ
class A {
	
}
//A클래스의 자식클래스인 B로 선언
class B extends A{
	
}
//A클래스의 자식클래스인 C로 선언
class C extends A{
	
}
//B클래스의 자식클래스인 D로 선언
class D extends B{
	
}
//C클래스의 자식클래스인 E로 선언
class E extends C{
	
}

public class ch7_07_PormotionExample {

	public static void main(String[] args) {
		
		//B클래스 타입의 변수 b 선언
		B b = new B();
		//C클래스 타입의 변수 c 선언
		C c = new C();
		//E클래스 타입의 변수 e 선언
		D d = new D();
		//D클래스 타입의 변수 d 선언
		E e = new E();
		
		//각각 선언한 변수들에 대한 자동 형변환 여부 확인
		
		//A클래스 타입의 변수(a1)에 B클래스 타입 변수 대입
		A a1 = b;
		//A클래스 타입의 변수(a2)에 C클래스 타입 변수 대입
		A a2 = c;
		//A클래스 타입의 변수(a3)에D클래스 타입 변수 대입
		A a3 = d;
		//A클래스 타입의 변수(a4)에 E클래스 타입 변수 대입
		A a4 = e;
		
		B b1 =d;
		C c1 = e;
		
		//B b2 = e;
		
		B b3 = (B)a1; //= >강제형번환 
		
	}
}
