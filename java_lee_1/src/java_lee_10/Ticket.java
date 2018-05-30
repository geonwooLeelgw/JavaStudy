package java_lee_10;

public class Ticket {
	int num=100;
	double price;
	
	Ticket(int num,double price){
		this.num = num;
		this.price = price;
	}

	int num() {
		return num++;
	}
	
}
