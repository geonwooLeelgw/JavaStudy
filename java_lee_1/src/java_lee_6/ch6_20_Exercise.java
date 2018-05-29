package java_lee_6;

public class ch6_20_Exercise {

	private String OwnerName;
	private int AccountNumber;
	private int Balance;
	private int deposit;
	private int withdraw;
	
	
	public String getOwnerName() {
		return OwnerName;
	}
	public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
	}
	public int getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		Balance = balance;
	}
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public int getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}
	
	public void result() {
		System.out.println("예금주 이름: "+getOwnerName());
		System.out.println("계좌번호: "+getAccountNumber());
		if(Balance>=0) {
		Balance += deposit;
		Balance -= withdraw;
		System.out.println("잔고: "+getBalance());}
		
	}
}
