package java_lee_8;

public class ch7_02_Student extends ch7_02_people {

	public int studentNo;
	
	public ch7_02_Student(String name, String ssn, int studentNo) {
		super(name, ssn);//부모클래스의 해당 매개변수를 이용하는 생성자를 바로 호출
		this.studentNo = studentNo; // 자식 (현재) 필드
	}

	
	
}
