package java_lee_7;
import java.util.*;
public class ch6_23_AbsValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ch6_23_AbsValueClass abs = new ch6_23_AbsValueClass();
		
		do {
			abs.print();
			
			if(abs.select==1) {
				System.out.println("두 점을 (x,y)순으로 입력해주세요.");
				System.out.print("첫번째 X좌표: ");
				abs.x1 = sc.nextDouble();
				System.out.print("첫번째 Y좌표: ");
				abs.y1 = sc.nextDouble();
				System.out.print("두번째 X좌표: ");
				abs.x2 = sc.nextDouble();
				System.out.print("두번째 Y좌표: ");
				abs.y2 = sc.nextDouble();
				System.out.println("두 점 사이의 거리는 "+abs.distance());
			}
			if(abs.select==2) {
				System.out.print("정수를 입력해주세요: ");
				abs.jeongsoo = sc.nextInt();
				System.out.println("입력하신 정수의 절대값은 "+abs.JeolDea()+" 입니다.");
			}
		}
		
		while(!(abs.select==3));
	}

}
