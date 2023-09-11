package Demo;

import java.util.Scanner;

public class FruitRunner {

	public static void main(String[] args) {
		System.out.println("enter your choice");
		Fruit p=new Fruit();
		Scanner s=new Scanner(System.in);
		int cost=s.nextInt();
		p.setCost(cost);
		System.out.println(p.getCost());
		
		
	

	}

}
