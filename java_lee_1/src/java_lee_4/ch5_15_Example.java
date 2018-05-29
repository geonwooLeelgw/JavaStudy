package java_lee_4;

public class ch5_15_Example {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5};
		String[] apples = {"사과","배","바나나","체리","포도"};
		
		int sum = 0;
		for(int num : nums) {
			sum += num;
			System.out.print(num+" ");
		}
		System.out.println("합은 "+sum);
		
		for(String apple : apples) {
			System.out.print(apple+" ");
		}
	}

}
