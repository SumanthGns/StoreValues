package ConstructerChaining;

public class Coffe {
	
	public String name;
	public String color;
	public int Quantity;
	public String location;
	
public Coffe() {
		
		System.out.println("Invoking with no argument");
		
	}
	public Coffe(String name, String color) {
		this.name=name;
		this.color=color;
		
		
	}
	
	public Coffe(String name, String color,int Quantity) {
		this.name=name;
		this.color=color;
		this.Quantity=Quantity;
		
		
	}

}
