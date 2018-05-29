package java_lee_4;
import java.util.*;
public class ch5_10_ArrayExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int[] arr1 = new int[5];
		int tmp = 0;
		for(int j=0;j<arr1.length;j++) {
			arr1[j]=sc.nextInt();
		}
		
		for(int i=0;i<arr1.length;i++) {
			for(int k=i+1;k<arr1.length;k++) {
				if(arr1[i]<arr1[k]) {
					tmp = arr1[i];
					arr1[i]=arr1[k];
					arr1[k]=tmp;
				}
			}
		}	
		for(int n=0;n<arr1.length;n++) {
			System.out.println(arr1[n]);
		}
			
	}	
		
}