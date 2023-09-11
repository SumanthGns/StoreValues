package runTIme;

public class GadgetRunner {
	public static void main(String[] args) {
		
		Gadgets g=new Mobile();
		g.feature();
		Gadgets g1=new Laptop();
		g1.feature();
		System.out.println(".........................");
		
		Gadgets gad;
		gad=new Mobile();
		gad.feature();
		gad=new Laptop();
		gad.feature();
	}

}
