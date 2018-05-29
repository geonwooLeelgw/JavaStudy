package java_lee_7;
import java.util.*;
//283p 19번
public class ch6_24_AccountExample {

	public static void main(String[] args) {
		ch6_24_AccountExampleClass account = new ch6_24_AccountExampleClass();
		
		account.setBalance(10000);
		System.out.println("현재 잔고: "+ account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고: "+ account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재 잔고: "+ account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재 잔고: "+ account.getBalance());
	}

}
