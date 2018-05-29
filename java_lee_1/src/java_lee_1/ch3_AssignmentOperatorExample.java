package java_lee_1;

public class ch3_AssignmentOperatorExample {

	public static void main(String[] args) {
		int result = 0;
		result +=10; //result = result + 10;
		System.out.println("result="+ result); //10
	
		result -=5;
		System.out.println("result="+ result); //5
		
		result *=5;
		System.out.println("result="+ result); // 25

		result /=5;
		System.out.println("result="+ result); //5

		result %= 3;
		System.out.println("result="+ result); //2

	}
	
}
