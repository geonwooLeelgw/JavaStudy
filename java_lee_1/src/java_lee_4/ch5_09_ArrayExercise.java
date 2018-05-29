package java_lee_4;
import java.util.*;
public class ch5_09_ArrayExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 문제
		 * 양수 5개를 입력 받아서 배열에 저장하고,
		 * 입력 받은 수 중 가장 큰 수를 출력하는 프로그램을 작성하시오.
		 */
		Scanner sc =new Scanner(System.in);
		
		System.out.println("양수 5개를 입력하세요.");
		int[] arr1 = new int[5];
		int max = 0;
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = sc.nextInt();
			if(arr1[i]>max) {
				max=arr1[i];
			}
			/*if(arr1[0]>arr1[1] ) {
				max = arr1[0];}
				else {
					max = arr1[1];
				
			}if(max<arr1[2]) {
				max = arr1[2]; 
			}if(max<arr1[3]) {
				max = arr1[3];
			}if(max<arr1[4]) {
				max = arr1[4];
			}*/
			
		}System.out.println("가장 큰 수는 "+max+"입니다.");
		
		
		
	}

}
