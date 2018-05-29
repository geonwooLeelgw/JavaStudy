package java_lee_7;
import java.util.*;
public class ch6_22_MemberServiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ch6_22_MemberService memberService = new ch6_22_MemberService();
		Scanner sc = new Scanner(System.in);
		int select = 0;
		String id = null;
		String password;
		do {
			System.out.println("수행할 서비스를 선택해주세요.");
			System.out.println("1.로그인 || 2. 로그아웃");
			System.out.print(">>");
			select = sc.nextInt();
			if(select ==1) {
				System.out.print("아이디를 입력하세요 : ");
				id = sc.next();
				System.out.print("비밀번호를 입력하세요 : ");
				password = sc.next();
				boolean result = memberService.login(id,password);
				
				if(result) {
					System.out.println(id+"님 로그인 되었습니다.");
					System.out.println("----------------------");
				} else {
					System.out.println("id 또는 password가 올바르지 않습니다.");
					System.out.println("----------------------");
					}
			}
			if(select==2) {
				System.out.println(id+"님 로그아웃 되었습니다.");
				System.out.println("----------------------");
			}
		}
		while(!(select==3));
		System.out.println("서비스 종료");
		
		sc.close();
		
		
	}

}
