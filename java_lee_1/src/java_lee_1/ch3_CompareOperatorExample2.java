package java_lee_1;

public class ch3_CompareOperatorExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); //false(x) true(o)
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5); //false
		//false o.1f 근사치 실제 값은 0.1000002232423
		System.out.println((float)v4 == v5); //true
		System.out.println((int)(v4*10) == (int)(v5*10)); //true
		System.out.println((int)(v4*10) == (int)v5*10); //false
		
	}

}
