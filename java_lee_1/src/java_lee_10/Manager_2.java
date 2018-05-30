package java_lee_10;

public class Manager_2 extends Employee_2 {
	
	double bonas;
	
	public Manager_2(String name, double price, double bonas) {
		super(name,price);
		this.bonas = bonas;
	}

	@Override
	double priceUp() {
		return price = (price*1.2) + bonas;
	}
}
