package Demo;

import java.util.Scanner;

public class Level {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your choice");
		int choice=scan.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("hai sumanth");
			break;
		case 2:
			System.out.println("hai priya");
			break;
			default:
				System.out.println("invalid choice");
			
			
		}
	}

}
