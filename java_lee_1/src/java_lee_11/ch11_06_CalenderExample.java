package java_lee_11;

import java.util.Calendar;

public class ch11_06_CalenderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		int hour = now.get(Calendar.HOUR);
		System.out.println(year);
		System.out.println(month); // 0부터 시작해서 1을 더해야함
		System.out.println(day);  
		System.out.println(week); //일 월 화 수 목 금 토 << 순서
		System.out.println(hour);
	}

}
