package java_lee_10;

public class ch7_11_InstanceofExample {
	// method1의 매개변수 : Parent클래스 타입의 변수 parent
	public static void method1(ch7_11_Parent parent) {
		//parent 변수가 ch7_11_Child 클래스 타입인지??
		if(parent instanceof ch7_11_Child) {
			//parent 변수를 Child 클래스 타입으로 강제형변환해서
			//Child 클래스 타입의 변수 child에 대입한다.
			ch7_11_Child child =(ch7_11_Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		}else {
			System.out.println("method1 - Child로 변환 실패");
		}
	}
	//강제 형변환이 가능한지 여부를 묻지 않고 강제 형변환 수행하는 메소드
	public static void method2(ch7_11_Parent parent) {
		ch7_11_Child child = (ch7_11_Child) parent;
		System.out.println("method2 - Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		
		/*객체 타입 확인을 위한 instanceof 연산자
		 *강제타입변환이 가능한지 여부를 판단하기 위해 사용하는 연산자*/
		 
		  
		// Parent 타입의 변수를 선언해서 Child객체를 대입
		// method1, 2를 각각 호출
		ch7_11_Parent ch = new ch7_11_Child();
		method1(ch);//성공
		method2(ch);//성공
		
		// Parent 타입의 변수를 선언해서 Parent객체를 대입
		// method1, 2를 각각 호출
		ch7_11_Parent pa = new ch7_11_Parent(); 
		method1(pa);//오류는 없지만 변환은 안됨.
		method2(pa);//오류
		
	}

}
