package Demo;

import java.util.Scanner;

public class Keyword {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		while(true) {
			
			System.out.println("enter choice");
			int choice=scan.nextInt();
			switch(choice) {
			
			case 1:
				System.out.println("hai sumanth");
				break;
				
			case 2:
				System.out.println("hai priyanka");
				break;
				
			case 3:
				System.out.println("Thank you!");
				System.exit(0);
				
				break;
			
				default:
					System.out.println("invalid choice");
			}
			System.out.println("...........................");
		}

	}

}
