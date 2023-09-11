package org;
import java.util.Scanner;

public class Person {
	
	public static void main(String[] args) {
		
		Apps a=new Apps();
		Scanner s=new Scanner(System.in);
		System.out.println("enter your choice to know ");
		System.out.println("1:Whatsapp\n 2:Instagram");
		int choice=s.nextInt();
		Internet obj=a.Message(choice);
		if(obj instanceof Whatsapp) {
			
			System.out.println("you got a message from whatsapp");
		}
		else if(obj instanceof Instagram) {
			
			System.out.println("you got an message from Instagram");
			
		}
		else {
			System.out.println("invalid text");
		}
		
		
	}
	

}
