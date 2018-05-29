package java_lee_1;

public class ch3_IncreaseDecreaseOperatorExample {
// 변수 앞에 ++이 붙으면 1을 증가시키고 계산이 사용
// 변수 뒤에++이 붙으면 일단 변수값을 사용하고 1을 증가시켜 놓음
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int x =10;
			int y =10;
			int z;
			System.out.println("---------------------");
			x++; // x=10, y=10 z=Null
			++x; // x=11, y=10 z=Null
			System.out.println("x=" +x);
			//x=11 => x=12
			System.out.println("---------------------");
			y--;
			--y;
			System.out.println("y=" +y);
			//y=9 => y=8
			System.out.println("---------------------");
			z = x++; 
			System.out.println("z=" +z); // z = 12
			System.out.println("x=" +x); // x = 13
			System.out.println("---------------------");
			z = ++x; //z=14
			System.out.println("z=" +z); // z= 14
			System.out.println("x=" +x); // x= 14
			System.out.println("---------------------"); //x=14, y=8, z=14
			z=++x + y++; //z = 15 + 8 =23 
			System.out.println("z=" +z); // z= 23
			System.out.println("x=" +x); // x= 15
			System.out.println("y=" +y); // y= 8
			
	}		

}
