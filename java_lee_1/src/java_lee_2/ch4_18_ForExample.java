package java_lee_2;
import java.util.*;
public class ch4_18_ForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 1부터 입력받은 n까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 계산하시오.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=num;i++) {
			sum += i;
		//2의 배수로 판단 : num%2==0
		//3의 배수로 판단 : num%3==0
			if(i%2==0) {
				sum -=i;
			}else if(i%3==0) {
				sum -=i;
			}else if(i%6==0) {
				sum +=i;
			}
			//if(i%2==0 || i%3==0)
		}
		System.out.println("총합 : "+sum);
		sc.close();

	/*
	 * Scanner sc = new Scanner(System.in); 
	 * int sum = 0;
	 * int num = sc.nextInt();
	 * for(int i=1, i<=num; i++){
	 * 
	 * if(i%2 != 0 || i%3 !=0){
	 * sum = sum+ i;
	 * }
	 * }
	 * System.out.pirntln("합계 : " + sum);
	 */
	
	}

}
