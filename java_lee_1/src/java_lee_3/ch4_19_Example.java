package java_lee_3;
//import java.util.*;
public class ch4_19_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 문제 : 1+(-2)+(3)+(-4)+...형태로 더했을 때 얼마까지 더해야 총합이 100이상이 되는지 구하기
		 */
		
		
		int sum = 0;
		int i;
		for(i=1;sum<=100;i++) {
			if(i%2==0) {
				sum -= i;
			}else if(i==1) {
				sum +=i;
			}else {
				sum +=i;
			}
			if(sum==100) {
				System.out.println(i); //반복문에 넣어야 함...
			}
			
		}
		System.out.println(i); //반복문이 끝나면 i가 더해짐
		System.out.println(sum);
		
		
		
		
		/*Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int sum=0;
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			sum += i;
			if(i%2==0) {
				sum -= i;
			}
			
		}
		
		
			System.out.println(sum);
			*/
		}
	}


