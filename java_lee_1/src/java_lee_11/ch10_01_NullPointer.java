package java_lee_11;

public class ch10_01_NullPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
				String data = null;
				System.out.println(data.toString()); //변환할것이 없다.
				System.out.println(data);
		}catch(NullPointerException e) {
			System.out.println("예외가 발생했으니 코드를 확인해 볼것");
		}
	}

}
