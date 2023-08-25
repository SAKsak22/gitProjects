package testProject;

public class BankAccountPO {
	int balance = 0;
	String name;
	
	public BankAccountPO() {
		
	}
	
	public BankAccountPO(int money) {
		balance = money;
	}
	public BankAccountPO(int money, String n) {
		balance = money;
		name = n;
	}
	
	
//	public int deposit(int amount) {
//		balance += amount;
//		return balance;
//		
//	}
//	
//	public int withdraw(int amount) {
//		balance -= amount;
//		return balance;
//		
//	}
//	
//	public int checkMyBalance() {
//		System.out.println("잔액 : " + balance);
//		return balance;
//	}
}

