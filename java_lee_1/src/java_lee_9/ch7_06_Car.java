package java_lee_9;
//접근제한자 다음에 final 이 온다.
public class ch7_06_Car {
	
	String model; //필드
	
	public void run () { //메소드
		System.out.println("달려~");
	}
	
	public final void stop() { //final 메소드
		System.out.println("멈춰!");
	}
}
