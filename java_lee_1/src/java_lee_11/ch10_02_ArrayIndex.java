package java_lee_11;

public class ch10_02_ArrayIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = new int[3];
		
		try {
		for(int i=0;i<=num.length;i++) {
			num[i]=1;
			System.out.println(i+"번째 성공");
		}
	}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("오류 발생!");
		} finally {
			System.out.println("fianlly는 무조건 실행됩니당");
		}
		
		
		
		
		/*num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		
		System.out.println(num[2]);
		*/
		//ArrayIndexOutOfBoundsException : 2 라는 에러가 뜸 크기가 2까지인데 3번째 인덱스가 들어가서 허허
		 
	}

}
