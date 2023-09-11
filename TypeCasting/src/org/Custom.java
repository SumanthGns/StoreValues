package org;
import java.util.Scanner;

public class Custom {

	public static void main(String[] args) {
		
		Seller s=new Seller();
		Scanner p=new Scanner(System.in);
		System.out.println("enter your choice");
		System.out.println("1:Laptop\n 2:Mobile");
		int choice=p.nextInt();
		Amazon obj=s.electronics(choice);
		if(obj instanceof Laptop) {
			System.out.println("your order is laptop");
		}
		else if(obj instanceof Mobile) {
			System.out.println("your order is mobile");
		}
		else {
			System.out.println("you not ordered anything something went wroung");
		}
		

	}

}
