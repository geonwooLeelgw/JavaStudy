package java_lee_2;

public class ch4_04_IfdiceExample {

	public static void main(String[] args) {
		/*랜덤 메소드
		 * Math.random() : double 실수 출력 0.0<= Math.random() <1.0
		 * 1~9까지의 난수를 발생시키려면
		 * (int)(Math.random()*10) (0~9)
		 * 1~10까지 난수
		 * (int)(Math.random()*10)+1 (1~10)
		 * 로또 번호(int)(Math.random()*45)+1 (1~45)
		 * 
		 * 주사위 번호 뽑기
		 * 1~6까지 난수를 발생해서
		 * 1가나오면 1번이 나왔습니다.
		 * 2가나오면 2번이 나왔습니다.
		 */
		int num = (int)(Math.random()*6)+1;
		if(num ==1) {
		System.out.println(num+"번이 나왔습니다.");}
		else if(num ==2) {
			System.out.println(num+"번이 나왔습니다.");}
		else if(num ==3) {
			System.out.println(num+"번이 나왔습니다.");}
		else if(num ==4) {
			System.out.println(num+"번이 나왔습니다.");}
		else if(num ==5) {
			System.out.println(num+"번이 나왔습니다.");}
		else  {
			System.out.println(num+"번이 나왔습니다.");}
		
		}
	}


