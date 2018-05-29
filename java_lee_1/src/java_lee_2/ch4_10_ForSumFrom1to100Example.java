package java_lee_2;

public class ch4_10_ForSumFrom1to100Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		for (int i=1;i<=100;i++) {
			sum +=i; //sum=sum+i;
		}
		System.out.println("1부터 100까지의 합계 : "+sum);
	}

}
