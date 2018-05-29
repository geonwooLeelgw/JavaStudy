package java_lee_6;

public class ch6_18_Exercise {
	String name;
	int assignmentScore;
	int examScore;
	double avg;
	
	/*ch6_18_Exercise(){
		
	}*/ //기본생성자는 자동으로 생성된다.
	
	void result() {
		System.out.println("이름: "+name);
		System.out.println("과제 점수: "+assignmentScore);
		System.out.println("시험 점수: "+examScore);
		avg=(assignmentScore+examScore)/2;
		if(avg>=90)
			System.out.println("학점: A");
		else
			System.out.println("학점: B");
		System.out.println();
	}
}
