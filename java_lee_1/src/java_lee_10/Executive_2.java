package java_lee_10;

public class Executive_2 extends Manager_2 {
	
	int josic;
	
	public Executive_2(String name, double price, double bonas, int josic) {
		super(name,price,bonas);
		this.josic = josic;
	}
	@Override
	double priceUp() {
		return price = (price*1.3)+bonas;
	}
}
