package java_lee_11;

import java.text.SimpleDateFormat;
import java.util.Date;
public abstract class ch11_05_DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		String strNow = now.toString();
		System.out.println(now);//Date 타입
		System.out.println(strNow); // String 타입
		
		SimpleDateFormat dsf = new SimpleDateFormat("yyyy년 mm월 dd일 hh시 mm분 ss초");
		//now라는 시간은 요 타입으로 바꿔준다.
		String strNow2 = dsf.format(now);
		System.out.println(strNow2);
	}

}
