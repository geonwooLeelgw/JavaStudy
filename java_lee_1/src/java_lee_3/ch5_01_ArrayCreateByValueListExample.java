package java_lee_3;

public class ch5_01_ArrayCreateByValueListExample {

	public static void main(String[] args) {
		//배열선언 : int 타입의 scores라는 배열 변수 선언
		//int[] scores;
		int scores[]= {83,90,87};
		
		//배열 값 접근(출력)
		System.out.println("scores[0]=" +scores[0]);
		System.out.println("scores[1]=" +scores[1]);
		System.out.println("scores[2]=" +scores[2]);
		
		//배열 길이
		int length=scores.length;
		System.out.println("배열길이 length 변수 값 : " +length);
		
		//배열 요소둘의 합구하기
		int sum=0;
		for(int i = 0; i<=scores.length; i++) {
			/*sum=sum+scores[0];
			sum=sum+scores[2];
			sum=sum+scores[3];*/
		
			sum =sum+scores[i];
		}
		System.out.println("총합 : "+sum);
		double avg = sum/scores.length;
		System.out.println("평균 : "+avg);
	}

}
