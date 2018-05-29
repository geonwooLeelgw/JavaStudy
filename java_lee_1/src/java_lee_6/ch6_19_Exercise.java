package java_lee_6;

public class ch6_19_Exercise {
	private String name;
	private int assignmentScore;
	private int examScore;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAssignmentScore() {
		return assignmentScore;
	}
	public void setAssignmentScore(int assignmentScore) {
		this.assignmentScore = assignmentScore;
	}
	public int getExamScore() {
		return examScore;
	}
	public void setExamScore(int examScore) {
		this.examScore = examScore;
	}
	void result() {
		System.out.println("이름: "+name);
		System.out.println("과제 점수: "+assignmentScore);
		System.out.println("시험 점수: "+examScore);
		System.out.println("학점: "+get());
		System.out.println();
	}


	public String get() {
		String grade;
		double avg=(assignmentScore+examScore)/2;
		if(avg>=90) {
			grade="A";
		} else 
			grade="B";
		return grade;
	}
}
