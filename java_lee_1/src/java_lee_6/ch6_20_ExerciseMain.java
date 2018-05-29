package java_lee_6;

public class ch6_20_ExerciseMain {

	public static void main(String[] args) {
		ch6_20_Exercise acct = new ch6_20_Exercise();
		
		acct.setOwnerName("이건우");
		
		acct.setAccountNumber(101);
		//System.out.println(acct.getBalance()); Balance의 초기값==0
		acct.setBalance(10000);
		
		acct.setDeposit(3000);
		
		acct.setWithdraw(5000);
		
		acct.result();
	}

}
