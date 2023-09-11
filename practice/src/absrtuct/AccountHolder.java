package absrtuct;

public class AccountHolder {

	public static void main(String[] args) {
		Atm obj=new Atm();
		
		obj.checkBalance();
		System.out.println(".....................");
		obj.deposite(5000);
		obj.checkBalance();
		
		System.out.println(".................");
		
		obj.withdraw(6000);
		obj.checkBalance();

	}

}
