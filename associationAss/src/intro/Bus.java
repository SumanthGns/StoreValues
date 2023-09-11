package intro;

public class Bus {
	
	private int number;
	
	Bus bus;
	public Bus(int number) {
		System.out.println("running in number");
		this.number=number;
		
	}
	public void setBus(Bus bus) {
		System.out.println("running in bus");
		this.bus=bus;
		
	}
	public void wheels() {
		System.out.println("invoking in wheels");
	}

}
