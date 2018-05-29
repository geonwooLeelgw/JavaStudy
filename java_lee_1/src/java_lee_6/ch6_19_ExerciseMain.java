package java_lee_6;

public class ch6_19_ExerciseMain {

	public static void main(String[] args) {
		ch6_19_Exercise ex1 = new ch6_19_Exercise();
		//setter를 이용한 필드값 할당
		ex1.setName("선남");
		ex1.setAssignmentScore(91);
		ex1.setExamScore(84);
		ex1.result();
		
		
		ch6_19_Exercise ex2 = new ch6_19_Exercise();
		ex2.setName("선녀");
		ex2.setAssignmentScore(86);
		ex2.setExamScore(95);
		
		System.out.println("이름: "+ex2.getName());
		System.out.println("과제 점수: "+ex2.getAssignmentScore());
		System.out.println("시험 점수: "+ex2.getExamScore());
		System.out.println("학점 : "+ex2.get());
	}

}
