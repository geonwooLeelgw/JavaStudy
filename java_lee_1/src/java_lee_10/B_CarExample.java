package java_lee_10;

public class B_CarExample {

	public static void main(String[] args) {
		B_Sedan sedan = new B_Sedan();
		B_Truck truck = new B_Truck();
		
		sedan.Box(4);
		truck.Box(5);
		
		sedan.Color="Green";
		truck.Color="black";
		
		System.out.println("sedan의 탑승인원은:"+sedan.people+"명    차량색은:"+sedan.Color);
		System.out.println("truck의 탑승인원은:"+truck.jim+"톤    차량색은:"+truck.Color);
	}

}
