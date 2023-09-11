package app;

public class Trainer {
	
	private String name;
	
	private Laptop laptop;//Association
	
	public Trainer(String name) {
		System.out.println("invoking main in Trainer");
		this.name=name;
	}
	public void setLaptop(Laptop laptop) {
		System.out.println("running in laptop");
		this.laptop=laptop;
	}
	public void work() {
		System.out.println("trainer as a work");
	}

}
