package java_lee_2;

public class ch4_12_forExample {

	public static void main(String[] args) {
		
		//출력 형태
		//1+2+3+4+...+10=55
		
		int sum = 0;
		int k=10;
		for(int i=1;i<10;i++) {
			System.out.print(i+"+");
			sum +=i;
		}
			/*for(int j=1;j<11;j++) {
				sum +=j;
			}*/
			sum +=k;
		System.out.print(k+"="+sum);
	}

}
