package absrtuct;

public class Atm implements Bank{
	int balance=10000;
	
	public void deposite(int amount) {
		System.out.println("amount deposite Rs."+amount);
		balance=balance+amount;
		System.out.println("amount deposited sucessfully");
		
		
		
	}
	public void withdraw(int amount) {
		System.out.println("withdraw amount Rs."+amount);
		balance=balance-amount;
		System.out.println("amount withdrawn sucessfully");
		
		
	}
	public void checkBalance() {
		System.out.println("Available balance is"+balance);
		
		
	}
	

}
