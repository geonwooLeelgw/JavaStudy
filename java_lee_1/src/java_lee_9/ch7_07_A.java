package java_lee_9;
//protected
public class ch7_07_A {
	
	protected int num=0;
	
	protected ch7_07_A() {
		
	}
	
	protected int result() {
		int sum=0;
		num++;
		sum +=num;
		return sum;
	}
	
}
