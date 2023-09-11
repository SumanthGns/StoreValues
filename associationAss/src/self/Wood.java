package self;

public class Wood {
	
	private int cost;
	Paper paper;
	
	public Wood(int cost) {
		System.out.println("invoking main in wood");
		this.cost=cost;
		
	}
	public void setPaper(Paper paper) {
		System.out.println("running in paper");
		this.paper=paper;
	}
	public void door() {
		System.out.println("running in door");
	}

}
