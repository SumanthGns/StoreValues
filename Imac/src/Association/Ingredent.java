package Association;

public class Ingredent {
	public String name;
	public int Quantity;
	public int cost;
	
	public Ingredent(String name, int Quantity,int cost) {
		System.out.println("invoking main in Ingredent");
		this.name=name;
		this.Quantity=Quantity;
		this.cost=cost;
		
		
	}
	public void printinfo() {
		System.out.println("name of the ingredent:" +this.name);
		System.out.println("Quantity of the ingredent:" +this.Quantity);
		System.out.println("cost of the ingredent:" +this.cost);
		
	}

}
