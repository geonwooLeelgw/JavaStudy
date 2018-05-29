package java_lee_4;
import java.util.*;
public class ch5_11_ArrayExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 거스름돈 문제
		 * 어떤금액을 입력하게 되면 각 동전이 몇 개씩 필요한지 출력 하는 문제
		 * 가능한 적은 수의 동전으로 거슬러 줄 수 있도록
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하시오. : ");
		int input = sc.nextInt();
		int arr1[] = {500, 100, 50, 10};
		for(int i =0;i<arr1.length;i++) {
			if(input>arr1[0]) {
				System.out.println("500원 : " +input/arr1[0]+"개");
				input = input%arr1[0];
			}else if(input>arr1[1]) {
				System.out.println("100원 : " +input/arr1[1]+"개");
				input = input%arr1[1];
			}else if(input>arr1[2]) {
				System.out.println(" 50원 : " +input/arr1[2]+"개");
				input = input%arr1[2];
			}else  {
				System.out.println(" 10원 : " +input/arr1[3]+"개");
			}
		}
		
		sc.close();
	}

}
