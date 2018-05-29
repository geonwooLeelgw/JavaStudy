package java_lee_7;
import java.util.*;
public class ch6_01_studentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("1번째 학생의 이름, 국어, 영어, 수학 성적을 입력하시오.");
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("국어성적: ");
		int korea = sc.nextInt();
		System.out.print("영어성적: ");
		int enlgish = sc.nextInt();
		System.out.print("수학성적: ");
		int math = sc.nextInt();
		
		ch6_01_student stud1 = new ch6_01_student(name,korea,enlgish,math);
		
		System.out.println("2번째 학생의 이름, 국어, 영어, 수학 성적을 입력하시오.");
		System.out.print("이름: ");
		name = sc.next();
		System.out.print("국어성적: ");
		korea = sc.nextInt();
		System.out.print("영어성적: ");
		enlgish = sc.nextInt();
		System.out.print("수학성적: ");
		math = sc.nextInt();
		
		ch6_01_student stud2 = new ch6_01_student(name,korea,enlgish,math);
		
		System.out.println("3번째 학생의 이름, 국어, 영어, 수학 성적을 입력하시오.");
		System.out.print("이름: ");
		name = sc.next();
		System.out.print("국어성적: ");
		korea = sc.nextInt();
		System.out.print("영어성적: ");
		enlgish = sc.nextInt();
		System.out.print("수학성적: ");
		math = sc.nextInt();
		
		ch6_01_student stud3 = new ch6_01_student(name,korea,enlgish,math);
		
		
		stud1.result();
		stud2.result();
		stud3.result();
		
		stud1.sum();
		stud2.sum();
		stud3.sum();
		
		int[] arr1 = new int[3];
		int max = 0;
		int min = 0;
		int seconds=0;
		arr1[0] = stud1.sum;
		arr1[1] = stud2.sum;
		arr1[2] = stud3.sum;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]>max) {
				max=arr1[i];
			}
			else if(max>arr1[i]) {
					min=arr1[i];
					
			}else seconds = arr1[i]; //2번째 친구는 오또케 찾을까요?...
			}
		System.out.println("1등"+max+"점");
		System.out.println("2등"+seconds+"점");
		System.out.println("3등"+min+"점");
			
	}}


