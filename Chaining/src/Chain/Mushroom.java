package Chain;

public class Mushroom {
	
	public String name;
	public int price;
	public String type;
	public boolean poison;
	
	public Mushroom() {
		
		System.out.println("running main in the mushroom");
		
	}
	
	public Mushroom(String name, int price, String type,Boolean poison) {
		
		this.name=name;
		this.price=price;
		this.type=type;
		this.poison=poison;
		
		
	}
	public Mushroom(String name, int price) {
		
		this.name=name;
		this.price=price;
		
	}


	

}
