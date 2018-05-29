package java_lee_1;
import java.util.*;
public class example2_suger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int suger;
		int bongtoo = 0;
		
		suger = sc.nextInt();
		
		if(3<= suger && suger <= 5000){
			if((suger / 5) >= 1) {
				bongtoo = suger / 5;
		}if(suger % 5 ==3) {
			bongtoo +=1;
		}}
			
		
		}
	}


