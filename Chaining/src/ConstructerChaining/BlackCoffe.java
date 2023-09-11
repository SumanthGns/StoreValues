package ConstructerChaining;

public class BlackCoffe extends Coffe {
	
	public BlackCoffe() {
		super("bangalore","dddd");
		
		System.out.println("invoking main in no argument");
		
		
	}
	public BlackCoffe(String location, int Quantity) {
		
		this.location=location;
		this.Quantity=Quantity;
		
		
	}

}
