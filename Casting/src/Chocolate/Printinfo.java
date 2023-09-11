package Chocolate;

public class Printinfo {
	
	public void PP(DarkChocolate chocolate) {
		
		DarkChocolate choco=new CaramelChocolate();
		System.out.println("name of the chocolate=" +choco.name);
		choco.cover();
		CaramelChocolate Cara=(CaramelChocolate)choco;
		System.out.println("color of choco=" +Cara.color);
		Cara.size();
		
		
	}

}
