package java20190402;
class BankAccount {
	int money = 50000;
	
	public int deposit(int amount) {
		return money += amount;
	}
	public int withdraw(int amount) {
		return money -= amount;
	}
	public int balance() {
	   return money;
		}
}

public class Bank {
	public static void main(String[] args) {
		BankAccount zxcv = new BankAccount();
		zxcv.deposit(10000);
		zxcv.withdraw(4000);
		System.out.println(zxcv.balance());
	}
}
