package java_lee_7;
import java.util.*;
public class ch6_23_AbsValueClass {
	double x1;
	double x2;
	double y1;
	double y2;
	int jeongsoo;
	int select=0;
	
	Scanner sc = new Scanner(System.in);
	
	double distance() {
		double dis = Math.sqrt(((x1-x2)*(x1-x2)+((y1-y2)*(y1-y2))));
		return dis;
	}
	
	int JeolDea() {
		if(jeongsoo<0) {
			jeongsoo = -jeongsoo;
		}
		return jeongsoo;
	}
	void print() {
		System.out.println("-------------------");
		System.out.println("수행할 내용을 선택하세요.");
		System.out.println("1. 두점사이의 거리 구하기");
		System.out.println("2. 절대값 구하기");
		System.out.print("선택>>");
		select = sc.nextInt();
		
	}
}
