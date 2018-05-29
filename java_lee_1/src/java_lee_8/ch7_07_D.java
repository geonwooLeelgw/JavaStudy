package java_lee_8;

import java_lee_9.ch7_07_A;

public class ch7_07_D extends ch7_07_A {
	
	public ch7_07_D(){ //생성자 안에
		//부모클래스의 생성자 호출
		super();
		//부모클래스(A클래스)의 필드, 메소드 접근가능한지 확인
		this.num=3;
		this.result();
	}
	
	public void run() {
		super.num=2;
	}
	
	
	
}
