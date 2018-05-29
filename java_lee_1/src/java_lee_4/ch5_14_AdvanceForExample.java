package java_lee_4;

public class ch5_14_AdvanceForExample {

	public static void main(String[] args) {
		/*
		 * 향상된 for문 (for-each문)
		 */
		
		int[] scores = {95,85,90,66,88};
		int sum=0;
		
		for(int score : scores) {
			sum += score;
			System.out.println(score);
		}
		System.out.println("총합: " +sum);
	}

}
