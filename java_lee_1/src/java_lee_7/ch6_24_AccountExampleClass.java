package java_lee_7;

public class ch6_24_AccountExampleClass {
	
	
	private int balance;
	static final int min_balance=0; //상수
	static final int max_balance=1000000; //상수
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance>=min_balance && balance<=max_balance)
		this.balance = balance;
	}
}
