package java_lee_8;

public class ch7_02_StudentExample {

	public static void main(String[] args) {
		
		ch7_02_Student student = new ch7_02_Student("이건우","1222-1222",18);
		
		//부모클래스의 필드
		System.out.println(student.name);
		System.out.println(student.ssn);
		
		//자식클래스의 필드
		System.out.println(student.studentNo);
	}

}
