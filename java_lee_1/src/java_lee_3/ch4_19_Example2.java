package java_lee_3;

public class ch4_19_Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=1; //숫자용 변수
		int sum = 0; //합계용 변수
		int count=1; //카운트용 변수
		int s=1; //부호용 변수
		
		while(true) {
			sum=sum+num;
			if(sum>=100)
				break;
			System.out.println(num);
			count++; //순차적 숫자 증가를 위한 증감연산자 
			s=-s; //부호변경 (s를 -1로 선언해도 무방) 
			num=s*count; 
			
		}
		System.out.println("숫자 : " +num);
		System.out.println("합계 : " +sum);
				
	}

}
