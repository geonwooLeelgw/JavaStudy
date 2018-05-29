package java_lee_7;
import java.util.*;
public class ch6_01_student {
	String name;
	int korean;
	int English;
	int math;
	
	ch6_01_student(String name, int korean, int English, int math){
		this.name = name;
		this.korean = korean;
		this.English = English;
		this.math = math;
	}
	
	void result() {
		System.out.println(name+" 학생의 평균 점수는: "+avg());
	}
	
	double avg() {
		double avg = (math+korean+English)/3;
		return avg;
	}
	int sum = 0;
	void sum() {
		sum =(math+korean+English);
		System.out.println(name+" 학생의 총점: "+sum);
	}
	
}
