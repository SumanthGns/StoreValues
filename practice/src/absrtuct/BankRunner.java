package absrtuct;

import java.util.Scanner;

public class BankRunner {

	public static void main(String[] args) {
		System.out.println("welcome to bank");
		System.out.println("...................");
		Bank b=new Atm();
		while(true) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("1:deposite\n2:withdraw\n3:checkBalance");
		System.out.println("enter choice:");
		int choice=s.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("deposite amount");
			int dAmt=s.nextInt();
			b.deposite(dAmt);
			break;
			
		case 2:
			System.out.println("amount withdrwan");
			int wAmt=s.nextInt();
			b.withdraw(wAmt);
			break;
			
		case 3:
			b.checkBalance();
			
			default:
				System.out.println("thank you");
				System.exit(0);
			
			
			
			
			
			
			
		
		}
		}
		
		
		
		}

}
