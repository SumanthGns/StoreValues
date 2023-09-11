package suman;

public class BikeTest {

	public static void main(String[] args) {
		
		Bike b=new Bike(200);
		
		System.out.println(b.getCost());
		
		b.setCost(2000);
		System.out.println("the cost of the bike");
		System.out.println(b.getCost());
		
		
		

	}

}
