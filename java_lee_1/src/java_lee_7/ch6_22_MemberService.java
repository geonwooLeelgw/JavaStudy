package java_lee_7;

public class ch6_22_MemberService {
	
	String id;
	String password;
	
	boolean login(String x, String y) {
		id = x; password = y;
		if(id.equals("yourid")&&password.equals("12345")) {
			return true;
		}else {
			return false;
		}
		}

	void logout(String x) {
		if(id.equals("yourid"))
		System.out.println("로그아웃 되었습니다.");
		}
	}

