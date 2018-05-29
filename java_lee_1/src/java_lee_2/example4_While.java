package java_lee_2;

public class example4_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		int sum = 0;
		while(num<=100) {
			sum += num;
			num++;
		}
		
		System.out.println("1부터 100까지의 합 : "+sum);
	}

}
