package java_lee_10;

public class AdvancedTicket extends Ticket {
	
	int reservation;
	int num=1000;
	
	AdvancedTicket(int num, double price, int reservation) {
		super(num, price); //부모 필드는 super
		this.reservation = reservation;
	}
	
	@Override //재정의
	int num() {
		return ++num;
	}

	double ReservationDiscount() {
		if(reservation>=30) {
			price *= 0.5;
		}
		else if(reservation>=10) {
			price *= 0.8;
		}
		else if(reservation>=5) {
			price *= 0.9;
		}else price *= 1;
		return price;
	}

}
