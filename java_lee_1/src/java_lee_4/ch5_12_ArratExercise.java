package java_lee_4;

public class ch5_12_ArratExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2차원 배열을 사용하여 평점 계산하기
		 */
		double score[][]= {{3.3, 3.4},
							{3.5,3.8},
							{4.2, 4.3},
							{3.9, 4.0}}; //4행 2열
		double avg = 0;
		double sum = 0;
		int count = 0;
		for(int i =0;i<score.length;i++) { //행의 길이 4
			for(int k=0;k<score[i].length;k++) { //i행의 열의 길이 => 2
				sum += score[i][k];
				count++;
			}
		
		}
		avg = sum/count;
		System.out.println("평균은: "+avg);
		System.out.println("합계: "+sum);
		
	}

}
