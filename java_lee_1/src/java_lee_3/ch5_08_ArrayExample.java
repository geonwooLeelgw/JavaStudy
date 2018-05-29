package java_lee_3;
import java.util.*;
public class ch5_08_ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*3열짜리 1차원 배열을 선언하고
		스캐너를 이용하여 값을 하나하나 입력하고
		입력된 값의 총 합 및 평균 값을 구하시오.*/
		int[] arr1 = new int[3];
		System.out.println("[0],[1],[2] 순서로 입력하시오.");
		Scanner sc = new Scanner(System.in);
		arr1[0] = sc.nextInt();
		arr1[1] = sc.nextInt();
		arr1[2] = sc.nextInt();
		int sum = 0;
		int i = 0;
		for(;i<arr1.length; i++) {
			sum += arr1[i]; 
			
		}
	
		double avg=0;
		avg =sum/arr1.length;
		/*avg = ((arr1[0]+arr1[1]+arr1[2])/arr1.length);*/
		System.out.println("평균:"+avg+"총합:"+sum);
	}

}
