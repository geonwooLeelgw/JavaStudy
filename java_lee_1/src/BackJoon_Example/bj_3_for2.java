package BackJoon_Example;
import java.util.*;
public class bj_3_for2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=num;i<=num;i--) {
			System.out.println(i);
			if(i==1) {
				break;
			}
		}	
	}

}
