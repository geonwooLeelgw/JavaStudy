package java_lee_2;

public class ch4_16_BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//무한 반복문
		while(true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			// 주사위 6이 나왓을 때 반복문 종료
			if(num==6) {
				break;
			}
		}
		System.out.println("반복문 종료됨.");
	}

}
