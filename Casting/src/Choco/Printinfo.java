package Choco;

public class Printinfo {
	
	public void Pr(Chocolate chocolate) {
		
		Chocolate ch=new HotChocolate();
		System.out.println("name of chocolate=" +ch.name);
		ch.taste();
		HotChocolate cho=(HotChocolate)ch;
		System.out.println("color=" +cho.color);
		cho.rating();
	}

}
