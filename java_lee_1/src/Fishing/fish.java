package Fishing;

public class fish {

	String name;
	double length;
	double price; //더블로 선언했기때문에 나중에 int로 캐스팅 해야함.
	
	fish(String name,double length,double price){
		this.name = name;
		this.length = length;
		this.price = price;

}
}
