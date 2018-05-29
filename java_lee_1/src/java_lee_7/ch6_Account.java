package java_lee_7;

public class ch6_Account {
	private String ano;
	private String owner;
	private int balance;
	
	public ch6_Account(String ano, String owner, int balance) {
		this.ano =ano;
		this.owner =owner;
		this.balance =balance;
	}
	//getter, setter : 쓰는 이유는 : 필드에서 직접적인 접근을 하지 않기 위해서 사용한다.
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
	
		public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void set1Balance(int balance) {
		this.balance += balance;
	}
	public void set2Balance(int balance) {
		this.balance -= balance;
	}
	
}
