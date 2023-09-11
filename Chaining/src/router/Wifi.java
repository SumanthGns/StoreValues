package router;

public class Wifi {
	
	public String name;
	public int range;
	public String type;
	public double price;
	public String speed;
	
	public Wifi() {
		
		System.out.println("Running main in the wifi");
	}
	public Wifi(String name, int range, String type, double price,String speed) {
		
		this.name=name;
		this.price=price;
		this.type=type;
		this.price=price;
		this.speed=speed;
		System.out.println("running main in the name, price,type,price,speed");
		
		
		
		
	}
	public Wifi(String name,int range,String type) {
		this.name=name;
		this.range=range;
		this.type=type;
		System.out.println("running main in the name, range,type");
		
	}

}
