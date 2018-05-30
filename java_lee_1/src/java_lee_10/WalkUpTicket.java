package java_lee_10;

public class WalkUpTicket extends Ticket {

	int select=0;
	
	WalkUpTicket(int num, double price, int select) {
		super(num, price);
		this.select = select;
	}

	public double normalTicket() {
		
		if(select==2) {
			 return price *= 1.05;
			
		}else
			return price;
	}
}
