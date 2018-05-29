package java_lee_3;

public class ch5_07_ArrayInaArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[][] mathScores = new int[2][3];
		
		for(int i =0;i<mathScores.length;i++) {//2행
			for(int k=0;k<mathScores[i].length;k++) {//3열
		
				System.out.println("mathScores["+i+"]["+k+"]="
								+mathScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] englishScores=new int[2][];
		englishScores[0]=new int[2];//1행에 2열 배정
		englishScores[1]=new int[3];//2행에 3열 배정
		
		for(int i =0;i<englishScores.length;i++) {
			for(int k=0;k<englishScores[i].length;k++) {
		
				System.out.println("englishScores["+i+"]["+k+"]="
								+englishScores[i][k]);
			}
		}
		int[][] javaScores= {{95,80},{92,96,80}};
	}

}
