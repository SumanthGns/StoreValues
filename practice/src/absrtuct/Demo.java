package absrtuct;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(true) {
		
		System.out.println("enter choice:");
		int choice=scan.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("hi welcom");
			break;
			
		case 2:
			System.out.println("bye visite again");
			break;
			
		case 3:
			System.out.println("thank you");
			break;
		case 4:
			System.out.println("end of the block");
			System.exit(0);
			
			
			
			default:
				System.out.println("invalid choice");
			
			
		}
		System.out.println("...................");
		}

	}

}
