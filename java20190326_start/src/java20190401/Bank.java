package java20190401;
class BankAccount{
	String accNumber;
	String ssNumber;
	int balance = 0;
	
	public void deposit(int amount) {}
	public void withdraw(int amount) {}
	public void checkMyBalance() {
		System.out.println(balance);
	}
	
	public void initAccount(String acc, String ss, int bal) { 
		accNumber = acc;
		ssNumber = ss;
		balance = bal;
	}
}

public class Bank {
	public static void main (String[] args) {
		BankAccount yoon = new BankAccount();
		yoon.initAccount("12-34-89", "990099-9090990", 10000);
		yoon.checkMyBalance();
	}

	}

