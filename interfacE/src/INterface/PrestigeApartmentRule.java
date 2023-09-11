package INterface;

public class PrestigeApartmentRule implements Apartment {

	@Override
	public void construct() {
		System.out.println("Invkoing all in PrestigeApartmentRule ");		
	}

	
	public static void main(String[] args) {
		Apartment app = new PrestigeApartmentRule();
		app.construct();
	}
	

	
	

	
		
	

}
