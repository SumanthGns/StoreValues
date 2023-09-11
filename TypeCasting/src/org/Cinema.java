package org;
import java.util.Scanner;

public class Cinema {

	public static void main(String[] args) {
		
		Channel c=new Channel();
		Scanner s=new Scanner(System.in);
		System.out.println("enter a channel number");
		System.out.println("1:Gemini\n 2:Maa");
		int choice=s.nextInt();
		Tv obj=c.show(choice);
		if(obj instanceof Gemini) {
			System.out.println("you watching Gemini");
		}
		else if (obj instanceof Maa) {
			
			System.out.println("you watching Maa");
		}
		else {
			System.out.println("you are not subscribed to any channel");
		}

	}

}
