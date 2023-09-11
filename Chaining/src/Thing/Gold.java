package Thing;

public class Gold {
	
	public String name;
	public int price;
	public String type;
	public String location;
	public String color;
	
	public Gold() {
		
		System.out.println("running main in the Gold ");
		
	}
	public Gold(String name,int price,String type,String location, String color) {
		
		this.name=name;
		this.price=price;
		this.location=location;
		
		
		
		System.out.println("running main in the name, price,type,location,color");
		
	}
	public Gold(String name, int price,String type) {
		
		System.out.println("running main in the name,price,type ");
		
	}

}
