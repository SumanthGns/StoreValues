package polymorhism.mehodOverloading;

public class Runner {

	public static void main(String[] args) {
		 Myntra m=new Myntra();
		 System.out.println("id of the product is given by");
		 m.purchase(0100);
		 System.out.println("cost and the location");
		 m.purchase(500, "hydrabad");
		 
		 m.purchase("shoes");
		 
	}

}
