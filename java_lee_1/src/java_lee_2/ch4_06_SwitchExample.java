package java_lee_2;

public class ch4_06_SwitchExample {

	public static void main(String[] args) {
		
		int num = (int)(Math.random()*6)+1; //Math.random = double형이니까 casting 해줘야함 (강제 형변환)
		switch(num) {
		case 1: //num==1인 경우
			System.out.println("1번이 나왔습니다.");
			break;
		case 2: //num==2인 경우
			System.out.println("2번이 나왔습니다.");
			break;
		case 3: //num==3인 경우
			System.out.println("3번이 나왔습니다.");
			break;
		case 4: //num==4인 경우
			System.out.println("4번이 나왔습니다.");
			break;
		case 5: //num==5인 경우
			System.out.println("5번이 나왔습니다.");
			break;
		default : //num==1~5가 아닌경우
			System.out.println("6번이 나왔습니다.");
			break;
			
		}
	}

}
