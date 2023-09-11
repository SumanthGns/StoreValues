package Demo;

public class Car {
	
	private int cost;
	private String brand;
	
	public void setcost(int cost) {
		this.cost=cost;//to differentiate local variable and memeber variable 
	}
	public void setbrand(String brand) {
		
		this.brand=brand;
	}
	public int  getcost() {
		return cost;
	}
	public String  getbrand() {
		return brand;
	}
	

}
